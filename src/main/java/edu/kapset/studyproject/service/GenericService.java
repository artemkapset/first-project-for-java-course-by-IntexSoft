package edu.kapset.studyproject.service;

import java.util.List;

public interface GenericService<T> {
    T save(T t);

    T update(T t);

    List<T> getAll();

    T getByName(String s);

    void delete(T t);

    void deleteAll();

    void deleteByName(String s);
}
