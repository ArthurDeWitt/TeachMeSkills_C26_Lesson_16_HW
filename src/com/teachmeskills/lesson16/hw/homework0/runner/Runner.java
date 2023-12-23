package com.teachmeskills.lesson16.hw.homework0.runner;

import com.teachmeskills.lesson16.hw.homework0.services.Order;
/*
Создать свой класс для описания заказа.
Класс должен содержать поля id заказа и стоимость заказа - обязательные поля.
Возможны другие поля по необходимости.
Создать несколько заказов и поместить их в коллекцию.
Вывести коллекцию на экран.
Отсортировать заказы и вывести отсортированную коллекцию на экран.
Заказы сортируются по цене по возрастанию.
Для сортировки заказов следует создать свой компаратор (смотрите пример с занятия).

Данный пример с реализацией через TreeMap БЕЗ компаратора.
 */
import java.util.Map;
import java.util.TreeMap;


public class Runner {
    public static void main(String[] args) {
        // Создание объекта TreeMap для хранения заказов с сортировкой по ключу (ID заказа)
        Map<Integer, Order> orderMap = new TreeMap<>();

        // Добавление заказов в TreeMap
        orderMap.put(1, new Order(1000000.01, "Half-Life 3"));
        orderMap.put(2, new Order(999999.99, "Cyberpunk 2099"));
        orderMap.put(3, new Order(19999.89, "Red Dead Redemption 3"));

        // Вывод отсортированной коллекции заказов на экран
        System.out.println("Sorted list of orders by ID:");
        for (Map.Entry<Integer, Order> entry : orderMap.entrySet()) {
            Order order = entry.getValue();
            System.out.println("ID: " + order.getOrderId() + ", Price: " + order.getOrderCost() +
                    ", Product name: " + order.getProductName() +
                    ", Quantity: " + order.getQuantity() +
                    ", Order Date: " + order.getOrderDate());
        }
    }
}
