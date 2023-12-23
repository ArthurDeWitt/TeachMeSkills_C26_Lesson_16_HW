package com.teachmeskills.lesson16.hw.homework1.services;

import com.teachmeskills.lesson16.hw.homework0.services.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Класс описания клиента (время регистрации, имя, возраст, коллекция заказов)
public class Client {
    private Date registrationDate;
    private String name;
    private int age;
    private List<Order> orders;

    public Client(Date registrationDate, String name, int age) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.orders = new ArrayList<>();
    }

    // Геттеры для получения значений полей
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Order> getOrders() {
        return orders;
    }

    // Метод для добавления заказа клиента
    public void addOrder(Order order) {
        this.orders.add(order);
    }
}


