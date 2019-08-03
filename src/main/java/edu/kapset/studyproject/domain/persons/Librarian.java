package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.domain.persons.Person;

public class Librarian extends Person {

    private Integer category;

    public Librarian() {
    }

    public Librarian(Long id, String surName, String givenName, Integer category) {
        super(id, surName, givenName);
        this.category = category;
    }

    public Librarian(Long id, String surName, String givenName, String patronymic, Integer category) {
        super(id, surName, givenName, patronymic);
        this.category = category;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        if (getPatronymic() != null) {
            return "Librarian{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    ", category='" + getCategory() + '\'' +
                    '}';
        } else {
            return "Librarian{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    ", category='" + getCategory() + '\'' +
                    '}';
        }
    }
}
