package edu.kapset.studyproject.dao;

import java.util.Collection;

public interface GenericDao<T> {
    T save(T t);

    T update(T t);

    Collection<T> getAll();

    T getByName(String s);

    void delete(T t);

    void deleteAll();

    void deleteByName(String s);
}
