package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.persons.Person;

import java.util.List;

public interface PersonService<T extends Person> extends GenericService<T> {
    List<T> getBySurname(String s);
}
