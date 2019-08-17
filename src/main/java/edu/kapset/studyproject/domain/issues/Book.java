package edu.kapset.studyproject.domain.issues;

import edu.kapset.studyproject.annotation.FileStorage;
import edu.kapset.studyproject.domain.persons.Author;

import java.time.LocalDate;

@FileStorage(name = "Book")
public class Book extends Issue{

    private Author author;

    public Book() {
    }

    public Book(String name, LocalDate dateOfIssue, Author author) {
        super(name, dateOfIssue);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", author=" + getAuthor() +
                ", dateOfIssue=" + getDateOfIssue() +
                '}';
    }
}
