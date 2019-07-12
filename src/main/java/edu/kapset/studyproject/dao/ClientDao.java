package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.persons.Client;

public interface ClientDao extends PersonDao<Client> {

    Client getById(Long id);
}
