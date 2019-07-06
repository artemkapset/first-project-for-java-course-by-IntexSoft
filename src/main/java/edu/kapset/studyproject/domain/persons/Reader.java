package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.domain.Address;

public class Reader extends Person {
    private Long readerId;
    private Address address;

    public Reader() {
    }

    public Reader(String surName, String givenName, String patronymic, Long readerId, Address address) {
        super(surName, givenName, patronymic);
        this.readerId = readerId;
        this.address = address;
    }

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
    }
}
