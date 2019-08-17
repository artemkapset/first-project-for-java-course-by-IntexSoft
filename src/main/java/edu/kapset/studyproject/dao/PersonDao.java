package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.persons.Person;

import java.util.List;

public interface PersonDao<T extends Person> extends GenericDao<T> {
    List<T> getBySurname(String s);
}
