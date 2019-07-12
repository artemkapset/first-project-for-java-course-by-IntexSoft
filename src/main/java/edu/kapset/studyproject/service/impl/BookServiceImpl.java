package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.BookDao;
import edu.kapset.studyproject.dao.impl.BookDaoImpl;
import edu.kapset.studyproject.domain.issues.Book;
import edu.kapset.studyproject.service.BookService;

import java.util.ArrayList;
import java.util.List;

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
    public Book save(Book book) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Book getByName(String s) {
        return null;
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
