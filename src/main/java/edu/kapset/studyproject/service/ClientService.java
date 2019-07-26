package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.persons.Client;

import java.util.Optional;

public interface ClientService extends PersonService<Client> {
    Optional<Client> getById(Long id);
}
