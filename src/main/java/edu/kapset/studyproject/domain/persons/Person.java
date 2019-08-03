package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.domain.BaseEntity;

public abstract class Person extends BaseEntity {
    private String surName;
    private String givenName;
    private String patronymic;

    public Person() {
    }

    public Person(Long id, String surName, String givenName) {
        super(id);
        this.surName = surName;
        this.givenName = givenName;
    }

    public Person(Long id, String surName, String givenName, String patronymic) {
        super(id);
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

    @Override
    public String toString() {
        if (patronymic != null) {
            return "Person{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    '}';
        } else {
            return "Person{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    '}';
        }
    }
}
