package edu.kapset.studyproject.domain.issues;

import java.time.LocalDate;

public class Journal extends Issue{

    private String number;
    private LocalDate dateOfIssue;

    public Journal() {
    }

    public Journal(Long id, String name, String number, LocalDate dateOfIssue) {
        super(id, name);
        this.number = number;
        this.dateOfIssue = dateOfIssue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
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
