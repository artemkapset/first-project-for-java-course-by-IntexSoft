package edu.kapset.studyproject.domain.persons;

public class Author extends Person {
    public Author() {
    }

    public Author(Long id, String surName, String givenName) {
        super(id, surName, givenName);
    }

    public Author(Long id, String surName, String givenName, String patronymic) {
        super(id, surName, givenName, patronymic);
    }

    @Override
    public String toString() {
        if (getPatronymic() != null) {
            return "Author{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    '}';
        } else {
            return "Author{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    '}';
        }
    }
}
