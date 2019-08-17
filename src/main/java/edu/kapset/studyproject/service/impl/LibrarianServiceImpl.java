package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.LibrarianDao;
import edu.kapset.studyproject.dao.impl.LibrarianDaoImpl;
import edu.kapset.studyproject.domain.persons.Librarian;
import edu.kapset.studyproject.service.LibrarianService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

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

    @Override
    public boolean fire(Librarian librarian) {
        //...
        librarianDao.delete(librarian);
        return true;
    }

    @Override
    public boolean hire(Librarian librarian) {
        //...
        librarianDao.save(librarian);
        return true;
    }

    @Override
    public boolean promote(Librarian librarian) {
        //...
        librarianDao.update(librarian);
        return true;
    }

    @Override
    public List<Librarian> getBySurname(String s) {
        return librarianDao.getBySurname(s);
    }

    @Override
    public Optional<Librarian> save(Librarian librarian) {
        return librarianDao.save(librarian);
    }

    @Override
    public Optional<Librarian> update(Librarian librarian) {
        return librarianDao.update(librarian);
    }

    @Override
    public Collection<Librarian> getAll() {
        return librarianDao.getAll();
    }

    @Override
    public Optional<Librarian> getById(Long id) {
        return librarianDao.getById(id);
    }

    @Override
    public void delete(Librarian librarian) {
        librarianDao.delete(librarian);
    }

    @Override
    public void deleteAll() {
        librarianDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {

    }
}
