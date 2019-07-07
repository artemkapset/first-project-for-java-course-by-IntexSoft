package edu.kapset.studyproject.dao;

import java.util.List;

public interface GenericDao<T> {
    T save(T t);

    T update(T t);

    List<T> getAll();

    T getByName(String s);

    void delete(T t);

    void deleteAll();

    void deleteByName(String s);
}
