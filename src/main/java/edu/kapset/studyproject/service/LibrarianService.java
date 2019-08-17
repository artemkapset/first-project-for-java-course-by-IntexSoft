package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.persons.Librarian;

import java.util.List;

public interface LibrarianService extends PersonService<Librarian> {
    boolean fire(Librarian librarian);

    boolean hire(Librarian librarian);

    boolean promote(Librarian librarian);
}
