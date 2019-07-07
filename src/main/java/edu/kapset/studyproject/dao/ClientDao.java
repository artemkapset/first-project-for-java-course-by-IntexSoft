package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.persons.Client;

import java.util.List;

public interface ClientDao extends GenericDao<Client> {

    Client getById(Long id);
}
