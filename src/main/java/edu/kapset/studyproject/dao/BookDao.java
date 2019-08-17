package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.issues.Book;

import java.util.List;

public interface BookDao extends IssueDao<Book> {
    List<Book> getByAuthor(String s);
}
