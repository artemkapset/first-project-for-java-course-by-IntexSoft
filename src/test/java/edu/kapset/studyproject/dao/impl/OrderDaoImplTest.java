package edu.kapset.studyproject.dao.impl;

import edu.kapset.studyproject.domain.issues.Book;
import edu.kapset.studyproject.domain.issues.Issue;
import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.domain.order.OrderStatus;
import edu.kapset.studyproject.domain.persons.Author;
import edu.kapset.studyproject.domain.persons.Client;
import edu.kapset.studyproject.service.OrderService;
import edu.kapset.studyproject.service.impl.OrderServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class OrderDaoImplTest {

    private static Client client1;
    private static Client client2;
    private static Client client3;
    private static Book book1;
    private static Book book2;
    private static Book book3;
    private static Book book4;
    private static List<Issue> issues1;
    private static List<Issue> issues2;
    private static List<Issue> issues3;
    private static Order order1;
    private static Order order2;
    private static Order order3;
    private static Order order4;
    private static OrderService osi;

    @BeforeClass
    public static void initObjects() {
        client1 = new Client("Ivanov", "Ivan", "Ivanovich");
        client2 = new Client("Petrov", "Petr", "Petrovich");
        client3 = new Client("Blinov", "Igor", "Nikolaevich");

        book1 = new Book("Thinking in Java",
                LocalDate.of(2015, 01, 01),
                new Author("Eckel", "Bruce"));

        book2 = new Book("The complete reference",
                LocalDate.of(2015, 02, 15),
                new Author("Schildt", "Herbert"));

        book3 = new Book("Effective Java",
                LocalDate.of(2014, 03, 20),
                new Author("Bloch", "Joshua"));

        book4 = new Book("Code Complete",
                LocalDate.of(2010, 04, 21),
                new Author("McConnell", "Steve"));

        issues1 = new ArrayList<>();
        issues1.add(book1);
        issues1.add(book2);
        issues1.add(book3);

        issues2 = new ArrayList<>();
        issues2.add(book2);
        issues2.add(book1);
        issues2.add(book4);

        issues3 = new ArrayList<>();
        issues3.add(book2);
        issues3.add(book3);
        issues3.add(book4);

        order1 = new Order(LocalDateTime.now(), OrderStatus.UNCHECKED, client1, issues1);
        order2 = new Order(LocalDateTime.now(), OrderStatus.CHECKED, client2, issues2);
        order3 = new Order(LocalDateTime.now(), OrderStatus.UNCHECKED, client2, issues1);
        order4 = new Order(LocalDateTime.now(), OrderStatus.CHECKED, client3, issues3);

        osi = OrderServiceImpl.getInstance();
        osi.deleteAll();
        osi.save(order1);
        osi.save(order2);
        osi.save(order3);
        osi.save(order4);
    }

    @AfterClass
    public static void clearObjects() {
        client1 = null;
        client2 = null;
        client3 = null;
        book1 = null;
        book2 = null;
        book3 = null;
        book4 = null;
        issues1 = null;
        issues2 = null;
        issues3 = null;
        order1 = null;
        order2 = null;
        order3 = null;
        order4 = null;
        osi = null;
    }


    @Test
    public void getOrdersBySurname1() {
        osi.getOrdersBySurname("Petrov")
                .forEach((o) -> assertEquals("Petrov", o.getClient().getSurname()));
    }

    @Test
    public void getOrdersBySurname2() {
        osi.getOrdersBySurname("Petrov")
                .forEach((o) -> assertNotEquals("Blinov", o.getClient().getSurname()));
    }

    @Test
    public void getOrdersByStatus1() {
        osi.getOrdersByStatus(OrderStatus.CHECKED).
                forEach((o) -> assertEquals(OrderStatus.CHECKED, o.getOrderStatus()));
    }

    @Test
    public void getOrdersByStatus2() {
        osi.getOrdersByStatus(OrderStatus.CHECKED).
                forEach((o) -> assertNotEquals(OrderStatus.UNCHECKED, o.getOrderStatus()));
    }
}