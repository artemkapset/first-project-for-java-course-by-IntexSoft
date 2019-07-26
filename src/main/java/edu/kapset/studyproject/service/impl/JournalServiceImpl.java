package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.JournalDao;
import edu.kapset.studyproject.dao.impl.JournalDaoImpl;
import edu.kapset.studyproject.domain.issues.Journal;
import edu.kapset.studyproject.service.JournalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JournalServiceImpl implements JournalService {

    private static JournalService instance;

    private JournalDao journalDao = JournalDaoImpl.getInstance();

    private JournalServiceImpl() {

    }

    public static JournalService getInstance() {
        if (instance == null) {
            instance = new JournalServiceImpl();
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
