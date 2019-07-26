package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.ClientDao;
import edu.kapset.studyproject.domain.persons.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientDaoImpl implements ClientDao {

    private static ClientDao instance;

    private ClientDaoImpl() {

    }

    public static ClientDao getInstance() {
        if (instance == null) {
            instance = new ClientDaoImpl();
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
