package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.JournalDao;
import edu.kapset.studyproject.dao.impl.JournalDaoImpl;
import edu.kapset.studyproject.domain.issues.Journal;
import edu.kapset.studyproject.service.JournalService;

import java.util.List;

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
    public Journal save(Journal journal) {
        return null;
    }

    @Override
    public Journal update(Journal journal) {
        return null;
    }

    @Override
    public List<Journal> getAll() {
        return null;
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
