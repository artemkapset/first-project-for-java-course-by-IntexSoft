package edu.kapset.studyproject.utils;

import java.util.Collection;

public interface Writer<T> {
    void write(T source, Collection<?> collection);
}
