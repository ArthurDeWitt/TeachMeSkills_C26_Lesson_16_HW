package com.teachmeskills.lesson16.hw.homework0_1.runner;

import com.teachmeskills.lesson16.hw.homework0.services.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1000000.01, "Half-Life 3"));
        orders.add(new Order(999999.99, "Cyberpunk 2099"));
        orders.add(new Order(19999.89, "Red Dead Redemption 3"));

        System.out.println("Order list:");
        for (Order order : orders) {
            System.out.println("ID: " + order.getOrderId() + ", Price: " + order.getOrderCost() +
                    ", Product Name: " + order.getProductName() +
                    ", Quantity: " + order.getQuantity() +
                    ", Order Date: " + order.getOrderDate());
        }

        // Используем метод sort у списка заказов с передачей компаратора, чтобы отсортировать заказы по возрастанию цены.
        orders.sort(Comparator.comparingDouble(Order::getOrderCost));

        System.out.println("\nSorted list of orders in ascending order by price:");
        for (Order order : orders) {
            System.out.println("ID: " + order.getOrderId() + ", Price: " + order.getOrderCost() +
                    ", Product Name: " + order.getProductName() +
                    ", Quantity: " + order.getQuantity() +
                    ", Order Date: " + order.getOrderDate());
        }
    }
}
