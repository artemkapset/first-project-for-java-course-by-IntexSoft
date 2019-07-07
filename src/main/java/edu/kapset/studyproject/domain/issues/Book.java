package edu.kapset.studyproject.domain.issues;

import edu.kapset.studyproject.domain.persons.Author;

import java.time.LocalDate;

public class Book extends Issue {
    private Author author;
    private LocalDate yearOfIssue;

    public Book() {
    }

    public Book(String name, Long issueId, Author author, LocalDate yearOfIssue) {
        super(name, issueId);
        this.author = author;
        this.yearOfIssue = yearOfIssue;
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
