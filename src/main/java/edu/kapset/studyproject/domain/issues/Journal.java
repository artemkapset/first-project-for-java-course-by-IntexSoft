package edu.kapset.studyproject.domain.issues;

import java.time.LocalDate;

public class Journal extends Issue{

    private Integer number;
    private LocalDate dateOfIssue;

    public Journal() {
    }

    public Journal(String name, Long issueId, Integer number, LocalDate dateOfIssue) {
        super(name, issueId);
        this.number = number;
        this.dateOfIssue = dateOfIssue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
}
