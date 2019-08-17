package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.OrderDao;
import edu.kapset.studyproject.dao.impl.OrderDaoImpl;
import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.domain.order.OrderStatus;
import edu.kapset.studyproject.service.OrderService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    private static OrderService instance;

    private OrderDao orderDao = OrderDaoImpl.getInstance();

    private OrderServiceImpl() {

    }

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderServiceImpl();
        }
        return instance;
    }

    @Override
    public List<Order> getOrdersBySurname(String s) {
        return orderDao.getOrdersBySurname(s);
    }

    @Override
    public List<Order> getOrdersByStatus(OrderStatus orderStatus) {
        return orderDao.getOrdersByStatus(orderStatus);
    }

    @Override
    public Optional<Order> save(Order order) {
        return orderDao.save(order);
    }

    @Override
    public Optional<Order> update(Order order) {
        return orderDao.update(order);
    }

    @Override
    public Collection<Order> getAll() {
        return orderDao.getAll();
    }

    @Override
    public Optional<Order> getById(Long id) {
        return orderDao.getById(id);
    }

    @Override
    public void delete(Order order) {
        orderDao.delete(order);
    }

    @Override
    public void deleteAll() {
        orderDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        orderDao.deleteById(id);
    }
}
