package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.domain.persons.Person;

public class Author extends Person {
    public Author() {
    }

    public Author(String surName, String givenName, String patronymic) {
        super(surName, givenName, patronymic);
    }
}
