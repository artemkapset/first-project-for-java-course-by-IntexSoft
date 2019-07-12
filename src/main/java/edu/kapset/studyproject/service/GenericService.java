package edu.kapset.studyproject.service;

import java.util.Collection;

public interface GenericService<T> {
    T save(T t);

    T update(T t);

    Collection<T> getAll();

    T getByName(String s);

    void delete(T t);

    void deleteAll();

    void deleteByName(String s);
}
