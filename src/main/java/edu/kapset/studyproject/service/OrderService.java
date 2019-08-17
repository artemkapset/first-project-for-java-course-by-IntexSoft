package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.domain.order.OrderStatus;

import java.util.List;

public interface OrderService extends GenericService<Order> {
    List<Order> getOrdersBySurname(String s);
    List<Order> getOrdersByStatus(OrderStatus orderStatus);
}
