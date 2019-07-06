package edu.kapset.studyproject.domain.issues;

import java.time.LocalDate;

public class Journal extends Issue {
    private String name;
    private Integer number;
    private LocalDate dateOfIssue;

    public Journal() {
    }

    public Journal(Long issueId, String name, Integer number, LocalDate dateOfIssue) {
        super(issueId);
        this.name = name;
        this.number = number;
        this.dateOfIssue = dateOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
