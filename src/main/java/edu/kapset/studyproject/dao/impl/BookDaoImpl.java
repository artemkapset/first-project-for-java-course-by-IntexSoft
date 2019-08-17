package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.BookDao;
import edu.kapset.studyproject.domain.issues.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao {

    private static BookDao instance;

    private BookDaoImpl() {
        super(Book.class, (o) -> {
            Book book = null;
            if (o instanceof Book) {
                book = (Book) o;
            }
            return book;
        });
    }

    public static BookDao getInstance() {
        if (instance == null) {
            instance = new BookDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Book> getByAuthor(String s) {
        return new ArrayList<>();
    }

    @Override
    public List<Book> getByName(String s) {
        return new ArrayList<>();
    }
}
