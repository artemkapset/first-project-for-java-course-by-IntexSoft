package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.JournalDao;
import edu.kapset.studyproject.dao.impl.JournalDaoImpl;
import edu.kapset.studyproject.domain.issues.Journal;
import edu.kapset.studyproject.service.JournalService;

import java.util.ArrayList;
import java.util.Collection;
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

    @Override
    public List<Journal> getByName(String s) {
        return journalDao.getByName(s);
    }

    @Override
    public Optional<Journal> save(Journal journal) {
        return journalDao.save(journal);
    }

    @Override
    public Optional<Journal> update(Journal journal) {
        return journalDao.update(journal);
    }

    @Override
    public Collection<Journal> getAll() {
        return journalDao.getAll();
    }

    @Override
    public Optional<Journal> getById(Long id) {
        return journalDao.getById(id);
    }

    @Override
    public void delete(Journal journal) {
        journalDao.delete(journal);
    }

    @Override
    public void deleteAll() {
        journalDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        journalDao.deleteById(id);
    }
}
