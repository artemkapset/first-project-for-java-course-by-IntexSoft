package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.AuthorDao;
import edu.kapset.studyproject.dao.impl.AuthorDaoImpl;
import edu.kapset.studyproject.domain.persons.Author;
import edu.kapset.studyproject.service.AuthorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
