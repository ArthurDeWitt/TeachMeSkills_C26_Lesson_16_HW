package com.teachmeskills.lesson16.hw.homework0_1.services;

class Orders {
    private int orderId;
    private double orderCost;
    private String productName;
    private int quantity;
    private String orderDate;

    public Orders(int orderId, double orderCost, String productName, int quantity, String orderDate) {
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
