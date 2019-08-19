package edu.kapset.studyproject.utils.concurrentsaving;

import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.service.OrderService;
import edu.kapset.studyproject.service.impl.OrderServiceImpl;

import java.util.Collection;
import java.util.concurrent.Callable;

public class ConcurrentSavingOrder implements Callable<Collection<Order>> {

    private Collection<Order> orderCollection;
    private OrderService os = OrderServiceImpl.getInstance();
    private static ConcurrentSavingOrder instance;

    public static ConcurrentSavingOrder getInstance() {
        if (instance == null) {
            instance = new ConcurrentSavingOrder();
        }
        return instance;
    }

    private ConcurrentSavingOrder() {        ;
    }

    @Override
    public Collection<Order> call() throws Exception {
        orderCollection.forEach((o) -> os.save(o));
        return orderCollection;
    }

    public void setOrderCollection(Collection<Order> orderCollection) {
        this.orderCollection = orderCollection;
    }
}
