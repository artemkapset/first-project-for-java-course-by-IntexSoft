package edu.kapset.studyproject.service;

import java.util.Collection;
import java.util.Optional;

public interface GenericService<T> {
    Optional<T> save(T t);

    Optional<T> update(T t);

    Collection<T> getAll();

    Optional<T> getByName(String s);

    void delete(T t);

    void deleteAll();

    void deleteByName(String s);
}
