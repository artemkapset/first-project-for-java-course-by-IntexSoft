package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.Order;
import edu.kapset.studyproject.domain.persons.Person;
import edu.kapset.studyproject.exceptions.DaoException;

import java.util.List;

public interface OrderDao extends GenericDao<Order> {
//    Long saveOrder (Order order) throws DaoException;
//    List<Order> getOrders() throws DaoException;

    List<Order> getOrdersBySurname(String s);  // возвращает список заявок по фамилии читателя

}
