package edu.kapset.studyproject.dao.impl;

import com.sun.org.apache.xpath.internal.operations.Or;
import edu.kapset.studyproject.dao.OrderDao;
import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.domain.order.OrderStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {

    private static OrderDao instance;

    private OrderDaoImpl() {
        super(Order.class, (o) -> {
            Order order = null;
            if (o instanceof Order) {
                order = (Order) o;
            }
            return order;
        });
    }

    public static OrderDao getInstance() {
        if (instance == null) {
            instance = new OrderDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Order> getOrdersBySurname(String s) {
        return new ArrayList<>();
    }

    @Override
    public List<Order> getOrdersByStatus(OrderStatus orderStatus) {
        return new ArrayList<>();
    }
}
