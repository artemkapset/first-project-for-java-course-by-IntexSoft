package edu.kapset.studyproject.domain.issues;

import edu.kapset.studyproject.domain.BaseEntity;

public abstract class Issue extends BaseEntity {
    private String name;

    public Issue() {
    }

    public Issue(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id=" + getId() +
                ", name='" + getName() +
                '}';
    }
}
