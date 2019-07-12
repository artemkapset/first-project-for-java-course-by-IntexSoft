package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.JournalDao;
import edu.kapset.studyproject.domain.issues.Journal;

import java.util.ArrayList;
import java.util.List;

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
    public Journal save(Journal journal) {
        return null;
    }

    @Override
    public Journal update(Journal journal) {
        return null;
    }

    @Override
    public List<Journal> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Journal getByName(String s) {
        return null;
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
