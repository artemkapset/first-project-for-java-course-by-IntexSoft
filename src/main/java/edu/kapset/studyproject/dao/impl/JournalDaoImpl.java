package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.JournalDao;
import edu.kapset.studyproject.domain.issues.Journal;

import java.util.ArrayList;
import java.util.List;

public class JournalDaoImpl extends GenericDaoImpl<Journal> implements JournalDao {

    private static JournalDao instance;

    private JournalDaoImpl() {
        super(Journal.class, (o) -> {
            Journal journal = null;
            if (o instanceof Journal) {
                journal = (Journal) o;
            }
            return journal;
        });
    }

    public static JournalDao getInstance() {
        if (instance == null) {
            instance = new JournalDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Journal> getByName(String s) {
        return new ArrayList<>();
    }
}
