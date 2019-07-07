package edu.kapset.studyproject.domain.persons;


public class Client extends Person {
    private Long clientId;

    public Client() {
    }

    public Client(String surName, String givenName, String patronymic, Long readerId) {
        super(surName, givenName, patronymic);
        this.clientId = readerId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
