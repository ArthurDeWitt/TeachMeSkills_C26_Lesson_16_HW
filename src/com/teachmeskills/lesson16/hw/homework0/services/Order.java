package com.teachmeskills.lesson16.hw.homework0.services;
/*
Класс описания заказа с необходимыми полями:
- id заказа
- стоимость заказа
- название продукта
- количество товаров
- дата заказа
 */
public class Order {
    private int orderId;
    private double orderCost;
    private String productName;
    private int quantity;
    private String orderDate;

    public Order(double orderCost, String productName) {
        this.orderId = orderId;
        this.orderCost = orderCost;
        this.productName = productName;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }
}
