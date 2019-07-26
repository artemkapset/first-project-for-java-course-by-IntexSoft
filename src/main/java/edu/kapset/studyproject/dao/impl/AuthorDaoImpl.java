package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.AuthorDao;
import edu.kapset.studyproject.domain.persons.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<Author> save(Author author) {
        return Optional.ofNullable(author);
    }

    @Override
    public Optional<Author> update(Author author) {
        return Optional.ofNullable(author);
    }

    @Override
    public List<Author> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Author> getByName(String s) {
        Author author = null;
        return Optional.ofNullable(author);
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
