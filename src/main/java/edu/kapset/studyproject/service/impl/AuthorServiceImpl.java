package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.AuthorDao;
import edu.kapset.studyproject.dao.impl.AuthorDaoImpl;
import edu.kapset.studyproject.domain.persons.Author;
import edu.kapset.studyproject.service.AuthorService;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private static AuthorService instance;

    private AuthorDao authorDao = AuthorDaoImpl.getInstance();

    private AuthorServiceImpl() {

    }

    public static AuthorService getInstance() {
        if (instance == null) {
            instance = new AuthorServiceImpl();
        }
        return instance;
    }

    // TODO - прописать реализацию методов

    @Override
    public Author save(Author author) {
        return null;
    }

    @Override
    public Author update(Author author) {
        return null;
    }

    @Override
    public List<Author> getAll() {
        return null;
    }

    @Override
    public Author getByName(String s) {
        return null;
    }

    @Override
    public void delete(Author author) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String s) {

    }
}
