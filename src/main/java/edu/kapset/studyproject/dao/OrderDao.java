package edu.kapset.studyproject.dao;

import edu.kapset.studyproject.domain.Order;
import edu.kapset.studyproject.exceptions.DaoException;

import java.util.List;

public interface OrderDao {
    Long saveOrder (Order order) throws DaoException;
    List<Order> getOrders() throws DaoException;
}
