package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.AuthorDao;
import edu.kapset.studyproject.dao.impl.AuthorDaoImpl;
import edu.kapset.studyproject.domain.persons.Author;
import edu.kapset.studyproject.service.AuthorService;

import java.util.ArrayList;
import java.util.Collection;
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

    @Override
    public List<Author> getBySurname(String s) {
        return authorDao.getBySurname(s);
    }

    @Override
    public Optional<Author> save(Author author) {
        return authorDao.save(author);
    }

    @Override
    public Optional<Author> update(Author author) {
        return authorDao.update(author);
    }

    @Override
    public Collection<Author> getAll() {
        return authorDao.getAll();
    }

    @Override
    public Optional<Author> getById(Long id) {
        return authorDao.getById(id);
    }

    @Override
    public void delete(Author author) {
        authorDao.delete(author);
    }

    @Override
    public void deleteAll() {
        authorDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        authorDao.deleteById(id);
    }
}
