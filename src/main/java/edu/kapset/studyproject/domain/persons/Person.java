package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.domain.BaseEntity;

public abstract class Person extends BaseEntity {
    private String surname;
    private String givenname;
    private String patronymic;

    public Person() {
    }

    public Person(String surname, String givenname) {
        this.surname = surname;
        this.givenname = givenname;
    }

    public Person(String surname, String givenname, String patronymic) {
        this.surname = surname;
        this.givenname = givenname;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}
