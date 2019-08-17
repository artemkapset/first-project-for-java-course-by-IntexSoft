package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.AuthorDao;
import edu.kapset.studyproject.domain.persons.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorDaoImpl extends GenericDaoImpl<Author> implements AuthorDao {

    private static AuthorDao instance;

    private AuthorDaoImpl() {
        super(Author.class, (o) -> {
            Author author = null;
            if (o instanceof Author) {
                author = (Author) o;
            }
            return author;
        });
    }

    public static AuthorDao getInstance() {
        if (instance == null) {
            instance = new AuthorDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Author> getBySurname(String s) {
        return new ArrayList<>();
    }
}
