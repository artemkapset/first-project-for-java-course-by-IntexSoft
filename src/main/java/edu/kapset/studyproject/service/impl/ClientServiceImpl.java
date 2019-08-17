package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.ClientDao;
import edu.kapset.studyproject.dao.impl.ClientDaoImpl;
import edu.kapset.studyproject.domain.persons.Client;
import edu.kapset.studyproject.service.ClientService;

import java.util.ArrayList;
import java.util.Collection;
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

    @Override
    public Optional<Client> save(Client client) {
        return clientDao.save(client);
    }

    @Override
    public Optional<Client> update(Client client) {
        return clientDao.update(client);
    }

    @Override
    public Collection<Client> getAll() {
        return clientDao.getAll();
    }

    @Override
    public Optional<Client> getById(Long id) {
        return clientDao.getById(id);
    }

    @Override
    public void delete(Client client) {
        clientDao.delete(client);
    }

    @Override
    public void deleteAll() {
        clientDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        clientDao.deleteById(id);
    }

    @Override
    public List<Client> getBySurname(String s) {
        return clientDao.getBySurname(s);
    }
}
