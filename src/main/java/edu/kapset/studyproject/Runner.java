package edu.kapset.studyproject;

import edu.kapset.studyproject.domain.issues.Book;
import edu.kapset.studyproject.domain.issues.Issue;
import edu.kapset.studyproject.domain.order.Order;
import edu.kapset.studyproject.domain.order.OrderStatus;
import edu.kapset.studyproject.domain.persons.Author;
import edu.kapset.studyproject.domain.persons.Client;
import edu.kapset.studyproject.service.OrderService;
import edu.kapset.studyproject.service.impl.OrderServiceImpl;
import edu.kapset.studyproject.utils.concurrentsaving.ConcurrentSavingClient;
import edu.kapset.studyproject.utils.concurrentsaving.ConcurrentSavingOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {

    public static void main(String[] args) {
        Client client1 = new Client("Ivanov", "Ivan", "Ivanovich");
        Client client2 = new Client("Petrov", "Petr", "Petrovich");
        Client client3 = new Client("Blinov", "Igor", "Nikolaevich");
        List<Client> clientList = new ArrayList<>();
        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);


        Book book1 = new Book("Thinking in Java",
                LocalDate.of(2015, 01, 01),
                new Author("Eckel", "Bruce"));

        Book book2 = new Book("The complete reference",
                LocalDate.of(2015, 02, 15),
                new Author("Schildt", "Herbert"));

        Book book3 = new Book("Effective Java",
                LocalDate.of(2014, 03, 20),
                new Author("Bloch", "Joshua"));

        Book book4 = new Book("Code Complete",
                LocalDate.of(2010, 04, 21),
                new Author("McConnell", "Steve"));

        List<Issue> issues1 = new ArrayList<>();
        issues1.add(book1);
        issues1.add(book2);
        issues1.add(book3);

        List<Issue> issues2 = new ArrayList<>();
        issues2.add(book2);
        issues2.add(book1);
        issues2.add(book4);

        List<Issue> issues3 = new ArrayList<>();
        issues3.add(book2);
        issues3.add(book3);
        issues3.add(book4);

        Order order1 = new Order(LocalDateTime.now(), OrderStatus.UNCHECKED, client1, issues1);
        Order order2 = new Order(LocalDateTime.now(), OrderStatus.CHECKED, client2, issues2);
        Order order3 = new Order(LocalDateTime.now(), OrderStatus.UNCHECKED, client2, issues1);
        Order order4 = new Order(LocalDateTime.now(), OrderStatus.CHECKED, client3, issues3);
        Set<Order> orderSet = new HashSet<>();
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);

        OrderService osi = OrderServiceImpl.getInstance();
        osi.deleteAll();
        osi.save(order1);
        osi.save(order2);
        osi.save(order3);
        osi.save(order4);

        System.out.println("Checking of getById :");
        System.out.println(osi.getById(2L).orElseThrow(() -> new RuntimeException("Order is not found")));
        System.out.println("-------------------");

        System.out.println("Checking of getOrdersBySurname :");
        osi.getOrdersBySurname("Petrov").forEach(System.out::println);
        System.out.println("-------------------");

        System.out.println("Checking of getOrdersByStatus :");
        osi.getOrdersByStatus(OrderStatus.UNCHECKED).forEach(System.out::println);
        System.out.println("-------------------");

        System.out.println("Checking of getOrdersByStatus :");
        osi.getOrdersByStatus(OrderStatus.CHECKED).forEach(System.out::println);
        System.out.println("-------------------");

        System.out.println("Checking of getAll :");
        osi.getAll().forEach(System.out::println);


        checkingOfExecutorService(clientList, orderSet, osi);

    }

    private static void checkingOfExecutorService(List<Client> clientList, Set<Order> orderSet, OrderService osi) {
        osi.deleteAll();

        System.out.println("=============================");
        System.out.println("Checking of ExecutorService :");

        ExecutorService es = Executors.newFixedThreadPool(2);


        ConcurrentSavingOrder savingOrder = ConcurrentSavingOrder.getInstance();
        savingOrder.setOrderCollection(orderSet);
        Future<Collection<Order>> orderResult =
                es.submit(savingOrder);

        ConcurrentSavingClient savingClient = ConcurrentSavingClient.getInstance();
        savingClient.setClientCollection(clientList);
        Future<Collection<Client>> clientResult =
                es.submit(savingClient);

        try {
            orderResult.get().forEach(System.out::println);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("=============================");

        try {
            clientResult.get().forEach(System.out::println);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("=============================");

        es.shutdown();
    }
}



