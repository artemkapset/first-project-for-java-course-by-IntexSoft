package edu.kapset.studyproject.domain.issues;

public abstract class Issue {
    private Long issueId;

    public Issue() {
    }

    public Issue(Long issueId) {
        this.issueId = issueId;
    }

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }
}
