package edu.kapset.studyproject.utils;

import java.util.Collection;

public interface Reader<T> {
    Collection<Object> read(T source);
}
