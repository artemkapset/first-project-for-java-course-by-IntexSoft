package edu.kapset.studyproject.service;

import edu.kapset.studyproject.domain.Order;

public class SaveOrder {

    public static void main(String[] args) {

        // проверка работоспособности приложения

    }



    //TODO - прописать реализацию методов

    // сохранение заявки читателя
    static long saveOrder(Order order) {
        System.out.println("saveOrder");
        // ...
        return 0L;
    }

    // создание заявки
    static Order buildOrder(long id) {
        System.out.println("buildOrder");
        // ...
        return new Order();
    }
}
