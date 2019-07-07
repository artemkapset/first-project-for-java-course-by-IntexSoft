package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.persons.Client;

import java.util.List;

public interface ClientService extends GenericService<Client> {

    Client getById(Long id);

}
