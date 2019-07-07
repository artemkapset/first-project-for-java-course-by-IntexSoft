package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.ClientDao;
import edu.kapset.studyproject.domain.persons.Client;

import java.util.List;

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
    public Client getById(Long id) {
        return null;
    }

    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client getByName(String s) {
        return null;
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
