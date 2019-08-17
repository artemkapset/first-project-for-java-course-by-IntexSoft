package edu.kapset.studyproject.domain.issues;

import edu.kapset.studyproject.annotation.FileStorage;

import java.time.LocalDate;

@FileStorage(name = "Journal")
public class Journal extends Issue{

    private String number;

    public Journal() {
    }

    public Journal(String name, LocalDate dateOfIssue, String number) {
        super(name, dateOfIssue);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + getId() +
                ", name='" + getName() +
                ", number='" + getNumber() +
                ", dateOfIssue=" + getDateOfIssue() +
                '}';
    }
}
