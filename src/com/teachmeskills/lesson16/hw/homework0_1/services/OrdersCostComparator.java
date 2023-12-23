package com.teachmeskills.lesson16.hw.homework0_1.services;

import java.util.Comparator;

/*
Реализация компаратора для сортировки заказов по цене
 */
public class OrdersCostComparator implements Comparator<Orders> {
    @Override
    public int compare(Orders o1, Orders o2) {
        return Double.compare(o1.getOrderCost(), o2.getOrderCost());
    }
}
