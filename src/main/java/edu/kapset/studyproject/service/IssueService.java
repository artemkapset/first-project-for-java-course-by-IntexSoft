package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.issues.Issue;

import java.util.List;

public interface IssueService<T extends Issue> extends GenericService<T> {
    List<T> getByName(String s);
}
