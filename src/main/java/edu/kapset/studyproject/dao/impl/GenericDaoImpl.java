package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.annotation.processor.FileStoragePathProcessor;
import edu.kapset.studyproject.dao.GenericDao;
import edu.kapset.studyproject.domain.BaseEntity;
import edu.kapset.studyproject.utils.Reader;
import edu.kapset.studyproject.utils.Writer;
import edu.kapset.studyproject.utils.impl.TextFileReader;
import edu.kapset.studyproject.utils.impl.TextFileWriter;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public abstract class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {
    final Writer<String> writer;
    final Reader<String> reader;
    final Function<Object, T> mapper;
    private final String path;

    protected GenericDaoImpl(Class<T> typeParameterClass, Function<Object, T> mapper) {
        this.writer = TextFileWriter.getInstance();
        this.reader = TextFileReader.getInstance();
        this.mapper = mapper;
        this.path = FileStoragePathProcessor.getInstance().getPath(typeParameterClass);
    }


    @Override
    public Optional<T> save(T t) {
        final Collection<T> collection = getCollection();
        t.setId(generateId(collection));
        collection.add(t);
        writer.write(path, collection);
        return Optional.of(t);
    }

    @Override
    public Optional<T> update(T t) {
        Collection<T> collection = getCollection();
        List<T> updatedList = getUpdatedList(t, collection);
        writer.write(path, updatedList);
        return Optional.of(t);
    }

    @Override
    public Collection<T> getAll() {
        return getCollection();
    }

    @Override
    public Optional<T> getById(Long id) {
        return getCollection()
                .stream()
                .filter((o) -> o.getId().equals(id))
                .findFirst();
    }

    @Override
    public void delete(T t) {
        Collection<T> collection = getCollection();
        List<T> tList = collection
                .stream()
                .filter((o) -> !(o.getId().equals(t.getId())))
                .collect(toList());
        writer.write(path, tList);
    }

    @Override
    public void deleteAll() {
        writer.write(path, new ArrayList<>());
    }

    @Override
    public void deleteById(Long id) {
        Collection<T> collection = getCollection();
        List<T> tList = collection
                .stream()
                .filter((o) -> !(o.getId().equals(id)))
                .collect(toList());
        writer.write(path, tList);
    }

    private Collection<T> getCollection() {
        return reader
                .read(path)
                .stream()
                .map(mapper)
                .collect(toList());
    }

    private Long generateId(Collection<T> collection) {
        Optional<Long> longOptional = collection
                .stream()
                .map(BaseEntity::getId)
                .max(Comparator.naturalOrder());
        return longOptional.orElse(0L) + 1l;
    }

    private List<T> getUpdatedList(T t, Collection<T> collection) {
        Optional<T> tOptional = collection
                .stream()
                .filter((o) -> o.getId().equals(t.getId()))
                .findFirst();
        final T element = tOptional.orElseThrow(
                () -> new RuntimeException("Cannot update a non-existing object!"));
        return collection
                .stream()
                .map((o) -> o.getId().equals(element.getId()) ? t : o)
                .collect(toList());
    }
}
