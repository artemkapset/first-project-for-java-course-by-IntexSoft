package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.JournalDao;
import edu.kapset.studyproject.domain.issues.Journal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JournalDaoImpl implements JournalDao {

    private static JournalDao instance;

    private JournalDaoImpl() {

    }

    public static JournalDao getInstance() {
        if (instance == null) {
            instance = new JournalDaoImpl();
        }
        return instance;
    }

    // TODO - прописать реализацию методов

    @Override
    public Optional<Journal> save(Journal journal) {
        return Optional.ofNullable(journal);
    }

    @Override
    public Optional<Journal> update(Journal journal) {
        return Optional.ofNullable(journal);
    }

    @Override
    public List<Journal> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Journal> getByName(String s) {
        Journal journal = null;
        return Optional.ofNullable(journal);
    }

    @Override
    public void delete(Journal journal) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String s) {

    }
}
