package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.LibrarianDao;
import edu.kapset.studyproject.domain.persons.Librarian;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibrarianDaoImpl implements LibrarianDao {

    private static LibrarianDao instance;

    private LibrarianDaoImpl() {

    }

    public static LibrarianDao getInstance() {
        if (instance == null) {
            instance = new LibrarianDaoImpl();
        }
        return instance;
    }

    // TODO - прописать реализацию методов

    @Override
    public List<Librarian> getByCategory(Integer i) {
        return new ArrayList<>();
    }

    @Override
    public Optional<Librarian> save(Librarian librarian) {
        return Optional.ofNullable(librarian);
    }

    @Override
    public Optional<Librarian> update(Librarian librarian) {
        return Optional.ofNullable(librarian);
    }

    @Override
    public List<Librarian> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Librarian> getByName(String s) {
        Librarian librarian = null;
        return Optional.ofNullable(librarian);
    }

    @Override
    public void delete(Librarian librarian) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String s) {

    }
}
