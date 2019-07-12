package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.persons.Client;

public interface ClientService extends PersonService<Client> {

    Client getById(Long id);

}
