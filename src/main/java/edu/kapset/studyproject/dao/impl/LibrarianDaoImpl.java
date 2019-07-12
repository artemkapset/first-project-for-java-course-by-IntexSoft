package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.LibrarianDao;
import edu.kapset.studyproject.domain.persons.Librarian;

import java.util.ArrayList;
import java.util.List;

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
    public Librarian save(Librarian librarian) {
        return null;
    }

    @Override
    public Librarian update(Librarian librarian) {
        return null;
    }

    @Override
    public List<Librarian> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Librarian getByName(String s) {
        return null;
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
