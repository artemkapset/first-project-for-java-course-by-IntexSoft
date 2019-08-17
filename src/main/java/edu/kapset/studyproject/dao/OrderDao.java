package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.domain.order.OrderStatus;

import java.util.List;

public interface OrderDao extends GenericDao<Order> {
    List<Order> getOrdersBySurname(String s);
    List<Order> getOrdersByStatus(OrderStatus orderStatus);
}
