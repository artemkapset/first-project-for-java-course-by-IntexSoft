package edu.kapset.studyproject.domain;

import edu.kapset.studyproject.domain.issues.Issue;
import edu.kapset.studyproject.domain.persons.Client;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order extends BaseEntity {

    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Client client;
    private List<Issue> issues;

    public Order() {
    }

    public Order(Long id, LocalDateTime orderDate, OrderStatus orderStatus, Client client, List<Issue> issues) {
        super(id);
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.client = client;
        this.issues = issues;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void addIssue(Issue issue) {    // метод addIssue вместо setIssue
        if (issues == null) {
            issues = new ArrayList<>();
        }
        issues.add(issue);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + getId() +
                ", orderDate=" + getOrderDate() +
                ", orderStatus=" + getOrderStatus() +
                ", client=" + getClient() +
                ", issues=" + getIssues() +
                '}';
    }
}
