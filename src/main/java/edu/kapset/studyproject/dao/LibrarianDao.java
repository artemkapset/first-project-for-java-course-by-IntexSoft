package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.persons.Librarian;

import java.util.List;

public interface LibrarianDao extends PersonDao<Librarian> {
    List<Librarian> getByCategory(Integer i);
}
