package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.BookDao;
import edu.kapset.studyproject.domain.issues.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDaoImpl implements BookDao {

    private static BookDao instance;

    private BookDaoImpl() {

    }

    public static BookDao getInstance() {
        if (instance == null) {
            instance = new BookDaoImpl();
        }
        return instance;
    }

    // TODO - прописать реализацию методов

    @Override
    public List<Book> getByAuthor(String s) {
        return new ArrayList<>();
    }

    @Override
    public Optional<Book> save(Book book) {
        return Optional.ofNullable(book);
    }

    @Override
    public Optional<Book> update(Book book) {
        return Optional.ofNullable(book);
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Book> getByName(String s) {
        Book book = null;
        return Optional.ofNullable(book);
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String s) {

    }
}
