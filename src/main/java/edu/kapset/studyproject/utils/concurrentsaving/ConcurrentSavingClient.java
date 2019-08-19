package edu.kapset.studyproject.utils.concurrentsaving;

import edu.kapset.studyproject.domain.persons.Client;
import edu.kapset.studyproject.service.ClientService;
import edu.kapset.studyproject.service.impl.ClientServiceImpl;

import java.util.Collection;
import java.util.concurrent.Callable;

public class ConcurrentSavingClient implements Callable<Collection<Client>> {

    private Collection<Client> clientCollection;
    private ClientService cs = ClientServiceImpl.getInstance();
    private static ConcurrentSavingClient instance;

    public static ConcurrentSavingClient getInstance() {
        if (instance == null) {
            instance = new ConcurrentSavingClient();
        }
        return instance;
    }

    private ConcurrentSavingClient() {
    }

    @Override
    public Collection<Client> call() throws Exception {
        clientCollection.forEach((o) -> cs.save(o));
        return clientCollection;
    }

    public void setClientCollection(Collection<Client> clientCollection) {
        this.clientCollection = clientCollection;
    }
}
