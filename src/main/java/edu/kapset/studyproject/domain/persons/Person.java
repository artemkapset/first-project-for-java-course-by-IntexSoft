package edu.kapset.studyproject.domain.persons;

public abstract class Person {
    private String surName;
    private String givenName;
    private String patronymic;

    public Person() {
    }

    public Person(String surName, String givenName, String patronymic) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
