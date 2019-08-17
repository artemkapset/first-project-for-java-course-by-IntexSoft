package edu.kapset.studyproject;

import edu.kapset.studyproject.domain.issues.Book;
import edu.kapset.studyproject.domain.issues.Issue;
import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.domain.order.OrderStatus;
import edu.kapset.studyproject.domain.persons.Author;
import edu.kapset.studyproject.domain.persons.Client;
import edu.kapset.studyproject.service.OrderService;
import edu.kapset.studyproject.service.impl.OrderServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Client client1 = new Client("Ivanov", "Ivan", "Ivanovich");
        Client client2 = new Client("Petrov", "Petr", "Petrovich");

        Book book1 = new Book("Thinking in Java",
                LocalDate.of(2015, 01, 01),
                new Author("Eckel", "Bruce"));

        Book book2 = new Book("The complete reference",
                LocalDate.of(2015, 02, 15),
                new Author("Schildt", "Herbert"));

        Book book3 = new Book("Effective Java",
                LocalDate.of(2014, 03, 20),
                new Author("Bloch", "Joshua"));

        List<Issue> issues1 = new ArrayList<>();
        issues1.add(book1);
        issues1.add(book2);
        issues1.add(book3);

        List<Issue> issues2 = new ArrayList<>();
        issues2.add(book2);
        issues2.add(book1);

        Order order1 = new Order(LocalDateTime.now(), OrderStatus.UNCHECKED, client1, issues1);
        Order order2 = new Order(LocalDateTime.now(), OrderStatus.UNCHECKED, client2, issues2);

        OrderService osi = OrderServiceImpl.getInstance();
        osi.deleteAll();
        osi.save(order1);
        osi.save(order2);
        System.out.println(osi.getById(2l).orElseThrow(() -> new RuntimeException("Order is not found")));
        System.out.println("-------------------");
        osi.getAll().forEach(System.out::println);
    }
}



