package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.ClientDao;
import edu.kapset.studyproject.dao.impl.ClientDaoImpl;
import edu.kapset.studyproject.domain.persons.Client;
import edu.kapset.studyproject.service.ClientService;

import java.util.ArrayList;
import java.util.List;

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
        return new ArrayList<>();
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
