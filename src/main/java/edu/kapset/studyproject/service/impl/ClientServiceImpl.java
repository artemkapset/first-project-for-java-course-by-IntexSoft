package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.ClientDao;
import edu.kapset.studyproject.dao.impl.ClientDaoImpl;
import edu.kapset.studyproject.domain.persons.Client;
import edu.kapset.studyproject.service.ClientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    private static ClientService instance;

    private ClientDao clientDao = ClientDaoImpl.getInstance();

    private ClientServiceImpl() {

    }

    public static ClientService getInstance() {
        if (instance == null) {
            instance = new ClientServiceImpl();
        }
        return instance;
    }

    // TODO - прописать реализацию методов

    @Override
    public Optional<Client> getById(Long id) {
        Client client = null;
        return Optional.ofNullable(client);
    }

    @Override
    public Optional<Client> save(Client client) {
        return Optional.ofNullable(client);
    }

    @Override
    public Optional<Client> update(Client client) {
        return Optional.ofNullable(client);
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Client> getByName(String s) {
        Client client = null;
        return Optional.ofNullable(client);
    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String s) {

    }
}
