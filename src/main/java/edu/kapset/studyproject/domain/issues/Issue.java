package edu.kapset.studyproject.domain.issues;

public abstract class Issue {
    private String name;
    private Long issueId;

    public Issue() {
    }

    public Issue(String name, Long issueId) {
        this.name = name;
        this.issueId = issueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }
}
