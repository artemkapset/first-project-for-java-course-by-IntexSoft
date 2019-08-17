package edu.kapset.studyproject.domain;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + getId() +
                '}';
    }
}
