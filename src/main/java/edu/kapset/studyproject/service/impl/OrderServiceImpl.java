package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.OrderDao;
import edu.kapset.studyproject.dao.impl.OrderDaoImpl;
import edu.kapset.studyproject.domain.Order;
import edu.kapset.studyproject.service.OrderService;

import java.util.ArrayList;
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

    // TODO - прописать реализацию методов

    @Override
    public List<Order> getOrdersBySurname(String s) {
        return new ArrayList<>();
    }

    @Override
    public Optional<Order> save(Order order) {
        return Optional.ofNullable(order);
    }

    @Override
    public Optional<Order> update(Order order) {
        return Optional.ofNullable(order);
    }

    @Override
    public List<Order> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Order> getByName(String s) {
        Order order = null;
        return Optional.ofNullable(order);
    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String s) {

    }
}
