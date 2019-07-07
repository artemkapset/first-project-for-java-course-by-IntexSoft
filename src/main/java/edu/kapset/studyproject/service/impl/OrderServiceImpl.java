package edu.kapset.studyproject.service.impl;

import edu.kapset.studyproject.dao.OrderDao;
import edu.kapset.studyproject.dao.impl.OrderDaoImpl;
import edu.kapset.studyproject.domain.Order;
import edu.kapset.studyproject.service.OrderService;

import java.util.List;

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
        return null;
    }

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public Order getByName(String s) {
        return null;
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
