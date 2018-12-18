package com.company.InternetShop;

import java.util.TreeSet;

/**
 * Создать несколько объектов класса Категория.
 * Создать объект класса User.
 */
public class Main {
    public static void main(String[] args) {
        Category[] categories = new Category[3];

        Product[] productsUser = {new Product("Mouse", 222, 3), new Product("Laptop", 17000, 4)};
        Basket basketUser = new Basket(productsUser);
//        Basket basketUser = new Basket({new Product("Mouse", 222, 3), new Product("Laptop", 17000, 4)});

        User user1 = new User("user1", "qwerty123456", basketUser);

        Product[] productChemistry = {new Product("Моющее 1", 20, 3), new Product("Моющее 2", 17, 4)};
        Product[] mobileDevices = {new Product("Мобильное устройство 1", 420, 1), new Product("Мобильное устройство 2", 817, 2)};
        Product[] laptopDevices = {new Product("Устройство 1", 220, 3), new Product("Устройство 2", 417, 4)};

        categories[0] = new Category("Химия", productChemistry);
//        categories[0] = new Category("Химия", {new Product("Моющее 1", 20, 3), new Product("Моющее 2", 17, 4)});
        categories[1] = new Category("Мобильные утсройства", mobileDevices);
        categories[2] = new Category("Устройства для ноутбуков", laptopDevices);


        for (Category category : categories) {
            System.out.println(category.toString());
        }

        System.out.println(user1.toString());
    }
}
