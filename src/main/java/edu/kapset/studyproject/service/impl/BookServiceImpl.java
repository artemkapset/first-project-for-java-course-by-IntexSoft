package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.BookDao;
import edu.kapset.studyproject.dao.impl.BookDaoImpl;
import edu.kapset.studyproject.domain.issues.Book;
import edu.kapset.studyproject.service.BookService;

import java.util.ArrayList;
import java.util.Collection;
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

    @Override
    public List<Book> getByAuthor(String s) {
        return bookDao.getByAuthor(s);
    }

    @Override
    public List<Book> getByName(String s) {
        return bookDao.getByName(s);
    }

    @Override
    public Optional<Book> save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Optional<Book> update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public Collection<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Optional<Book> getById(Long id) {
        return bookDao.getById(id);
    }

    @Override
    public void delete(Book book) {
        bookDao.delete(book);
    }

    @Override
    public void deleteAll() {
        bookDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        bookDao.deleteById(id);
    }
}
