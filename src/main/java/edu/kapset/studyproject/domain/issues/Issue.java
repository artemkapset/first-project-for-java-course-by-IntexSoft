package edu.kapset.studyproject.domain.issues;

import edu.kapset.studyproject.domain.BaseEntity;

import java.time.LocalDate;

public abstract class Issue extends BaseEntity {
    private String name;
    private LocalDate dateOfIssue;

    public Issue() {
    }

    public Issue(String name, LocalDate dateOfIssue) {
        this.name = name;
        this.dateOfIssue = dateOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

}
