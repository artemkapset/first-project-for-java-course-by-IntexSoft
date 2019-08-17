package edu.kapset.studyproject.domain.issues;

import edu.kapset.studyproject.annotation.FileStorage;
import edu.kapset.studyproject.domain.persons.Author;

import java.time.LocalDate;

@FileStorage(name = "Book")
public class Book extends Issue{
    private Author author;
    private LocalDate yearOfIssue;

    public Book() {
    }

    public Book(Long id, String name, Author author, LocalDate yearOfIssue) {
        super(id, name);
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", author=" + getAuthor() +
                ", yearOfIssue=" + getYearOfIssue() +
                '}';
    }
}
