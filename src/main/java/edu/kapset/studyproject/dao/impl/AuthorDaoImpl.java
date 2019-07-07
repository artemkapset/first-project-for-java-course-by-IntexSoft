package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.AuthorDao;
import edu.kapset.studyproject.domain.persons.Author;

import java.util.List;

public class AuthorDaoImpl implements AuthorDao {

    private static AuthorDao instance;

    private AuthorDaoImpl() {

    }

    public static AuthorDao getInstance() {
        if (instance == null) {
            instance = new AuthorDaoImpl();
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
