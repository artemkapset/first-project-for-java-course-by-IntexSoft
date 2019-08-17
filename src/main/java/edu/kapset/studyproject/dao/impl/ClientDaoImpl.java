package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.dao.ClientDao;
import edu.kapset.studyproject.domain.persons.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl extends GenericDaoImpl<Client> implements ClientDao {

    private static ClientDao instance;

    private ClientDaoImpl() {
        super(Client.class, (o) -> {
            Client client = null;
            if (o instanceof Client) {
                client = (Client) o;
            }
            return client;
        });
    }

    public static ClientDao getInstance() {
        if (instance == null) {
            instance = new ClientDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Client> getBySurname(String s) {
        return new ArrayList<>();
    }
}
