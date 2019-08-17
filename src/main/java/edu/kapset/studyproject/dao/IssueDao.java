package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.issues.Issue;

import java.util.List;

public interface IssueDao<T extends Issue> extends GenericDao<T> {
    List<T> getByName(String s);
}
