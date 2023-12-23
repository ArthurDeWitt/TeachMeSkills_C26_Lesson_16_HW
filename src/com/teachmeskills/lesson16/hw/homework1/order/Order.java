package com.teachmeskills.lesson16.hw.homework1.order;

// Класс для описания заказа (цена, описание)
class Order {
    private double price;
    private String description;

    public Order(double price, String description) {
        this.price = price;
        this.description = description;
    }

    // Геттеры для получения значений полей
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
