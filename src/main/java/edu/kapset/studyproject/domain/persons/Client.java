package edu.kapset.studyproject.domain.persons;


public class Client extends Person {

    //TODO - продумать необходимость наличия поля List<Issue> issues ("взятые клиентом издания")

    public Client() {
    }

    public Client(Long id, String surName, String givenName) {
        super(id, surName, givenName);
    }

    public Client(Long id, String surName, String givenName, String patronymic) {
        super(id, surName, givenName, patronymic);
    }

    @Override
    public String toString() {
        if (getPatronymic() != null) {
            return "Client{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    '}';
        } else {
            return "Client{" +
                    "id=" + getId() +
                    ", surName='" + getSurName() + '\'' +
                    ", givenName='" + getGivenName() + '\'' +
                    '}';
        }
    }
}
