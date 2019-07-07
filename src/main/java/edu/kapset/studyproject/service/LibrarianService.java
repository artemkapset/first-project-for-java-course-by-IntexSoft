package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.persons.Librarian;

import java.util.List;

public interface LibrarianService extends GenericService<Librarian> {

    List<Librarian> getByCategory(Integer i);

}
