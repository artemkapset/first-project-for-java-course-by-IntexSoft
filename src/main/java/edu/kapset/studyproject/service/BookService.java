package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.issues.Book;

import java.util.List;

public interface BookService extends IssueService<Book> {

    List<Book> getByAuthor(String s);   // возвращает список книг по фамилии автора

}
