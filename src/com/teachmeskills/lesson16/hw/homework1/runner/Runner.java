package com.teachmeskills.lesson16.hw.homework1.runner;

import com.teachmeskills.lesson16.hw.homework0.services.Order;
import com.teachmeskills.lesson16.hw.homework1.services.Client;
import com.teachmeskills.lesson16.hw.homework1.services.Passport;
/*
Создать класс для описания клиента.
 * Поместить в класс поля для описания клиента (дата регистрации, имя, возраст и другие поля по усмотрению).
 * Класс клиента должен содержать поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
 * Класс заказа должен содержать поля для описания заказ (цена, описание и возможны другие поля).
 * Создать нескольких клиентов.
 * Для каждого клиента создать несколько заказов и поместить их в поле-коллекцию для заказов.
 * Создать коллекцию типа Мар и заполнить ее парами "номер паспорта клиента" -> "объект класса клиент".
 * Номера паспортов можно хранить как константы в созданном для этого интерфейсе.
 * Пройти циклом по коллекции и вывести на экран:
 * 	- все пары ключ-значение, использую Map. Entry<K, V> entry : map.entrySet()
 * 	- все пары ключ-значение, использую итератор
 * 	- все ключи, используя map.keySet()
 * 	- все значения, используя map.values()
 */
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.teachmeskills.lesson16.hw.homework1.constants.Passport;

public class Runner {
    public static void main(String[] args) {
        // Создание клиентов
        Client client1 = new Client(new Date(), "Arthur", 25);
        Client client2 = new Client(new Date(), "Ivan", 26);
        Client client3 = new Client(new Date(), "Daniil", 27);

        // Добавление заказов для каждого клиента
        client1.addOrder(new Order(10.0, "Piwo Polska"));
        client1.addOrder(new Order(25.5, "Vodka Stolichnaya"));
        client2.addOrder(new Order(8.25, "Smetana"));
        client3.addOrder(new Order(3.78, "Pelmeni"));

        // Создание и заполнение коллекции типа Мар
        Map<String, Client> clientMap = new HashMap<>();
        clientMap.put(Passport.PASSPORT_1, client1);
        clientMap.put(Passport.PASSPORT_2, client2);
        clientMap.put(Passport.PASSPORT_3, client3);

        // Вывод всех пар ключ-значение, используя Map. Entry<K, V>
        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getName());
        }

        // Вывод всех пар ключ-значение, используя итератор
        Iterator<Map.Entry<String, Client>> iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getName());
        }

        // Вывод всех ключей, используя map.keySet()
        System.out.println("Keys: " + clientMap.keySet());

        // Вывод всех значений, используя map.values()
        System.out.println("Values: " + clientMap.values());
    }
}
