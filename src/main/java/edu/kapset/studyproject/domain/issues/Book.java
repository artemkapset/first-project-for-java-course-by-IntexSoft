package edu.kapset.studyproject.domain.issues;

import edu.kapset.studyproject.domain.persons.Author;

import java.time.LocalDate;

public class Book extends Issue {
    private String name;
    private Author author;
    private LocalDate yearOfIssue;

    public Book() {
    }

    public Book(Long issueId, String name, Author author, LocalDate yearOfIssue) {
        super(issueId);
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
