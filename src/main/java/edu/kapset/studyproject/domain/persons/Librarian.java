package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.domain.persons.Person;

public class Librarian extends Person {

    private Integer category;

    public Librarian() {
    }

    public Librarian(String surName, String givenName, String patronymic, Integer category) {
        super(surName, givenName, patronymic);
        this.category = category;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
