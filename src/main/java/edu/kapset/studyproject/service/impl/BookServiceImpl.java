package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.BookDao;
import edu.kapset.studyproject.dao.impl.BookDaoImpl;
import edu.kapset.studyproject.domain.issues.Book;
import edu.kapset.studyproject.service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    private static BookService instance;

    private BookDao bookDao = BookDaoImpl.getInstance();

    private BookServiceImpl() {

    }

    public static BookService getInstance() {
        if (instance == null) {
            instance = new BookServiceImpl();
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
