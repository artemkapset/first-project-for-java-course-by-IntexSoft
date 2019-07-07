package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.Order;

import java.util.List;

public interface OrderService extends GenericService<Order> {

    List<Order> getOrdersBySurname(String s);  // возвращает список заявок по фамилии читателя


//    public void checkAll();
//
//    public void checkOneOrder(Order order);
//
//    public List<Order> readOrders();

}
