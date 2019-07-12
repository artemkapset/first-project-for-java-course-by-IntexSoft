package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.LibrarianDao;
import edu.kapset.studyproject.dao.impl.LibrarianDaoImpl;
import edu.kapset.studyproject.domain.persons.Librarian;
import edu.kapset.studyproject.service.LibrarianService;

import java.util.ArrayList;
import java.util.List;

public class LibrarianServiceImpl implements LibrarianService {

    private static LibrarianService instance;

    private LibrarianDao librarianDao = LibrarianDaoImpl.getInstance();

    private LibrarianServiceImpl() {

    }

    public static LibrarianService getInstance() {
        if (instance == null) {
            instance = new LibrarianServiceImpl();
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
