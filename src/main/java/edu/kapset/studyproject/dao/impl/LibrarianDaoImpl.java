package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.LibrarianDao;
import edu.kapset.studyproject.domain.persons.Librarian;

import java.util.ArrayList;
import java.util.List;
public class LibrarianDaoImpl extends GenericDaoImpl<Librarian> implements LibrarianDao {

    private static LibrarianDao instance;

    private LibrarianDaoImpl() {
        super(Librarian.class, (o) -> {
            Librarian librarian = null;
            if (o instanceof Librarian) {
                librarian = (Librarian) o;
            }
            return librarian;
        });
    }

    public static LibrarianDao getInstance() {
        if (instance == null) {
            instance = new LibrarianDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Librarian> getBySurname(String s) {
        return new ArrayList<>();
    }
}
