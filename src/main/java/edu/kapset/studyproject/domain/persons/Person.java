package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.domain.BaseEntity;

public abstract class Person extends BaseEntity {
    private String surname;
    private String givenname;
    private String patronymic;

    public Person() {
    }

    public Person(Long id, String surname, String givenname) {
        super(id);
        this.surname = surname;
        this.givenname = givenname;
    }

    public Person(Long id, String surname, String givenname, String patronymic) {
        super(id);
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

    @Override
    public String toString() {
        if (patronymic != null) {
            return "Person{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    '}';
        } else {
            return "Person{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    '}';
        }
    }
}
