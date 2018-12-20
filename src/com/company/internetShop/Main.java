package com.company.internetShop;

import com.company.internetShop.login.LoginUser;
import com.company.internetShop.sourceClass.Basket;
import com.company.internetShop.sourceClass.Category;
import com.company.internetShop.sourceClass.Product;
import com.company.internetShop.sourceClass.User;

/**
 * Создать несколько объектов класса Категория.
 * Создать объект класса User.
 */
public class Main {
    public static void main(String[] args) {
        Category[] categories = new Category[3];

        Basket basketUser = new Basket(new Product[]{new Product("Mouse", 222, 3), new Product("Laptop", 17000, 4)});

        User user1 = new User("user1", "qwerty123456", basketUser);

        categories[0] = new Category("Химия", new Product[]{new Product("Моющее 1", 20, 3), new Product("Моющее 2", 17, 4)});
        categories[1] = new Category("Мобильные утсройства", new Product[]{new Product("Мобильное устройство 1", 420, 1), new Product("Мобильное устройство 2", 817, 2)});
        categories[2] = new Category("Устройства для ноутбуков", new Product[]{new Product("Устройство 1", 220, 3), new Product("Устройство 2", 417, 4)});

//        for (Category category : categories) {
//            System.out.println(category.toString());
//        }
//
//        System.out.println(user1.toString());
        User user2 = LoginUser.getUserCredentials();
        System.out.println(user2.toString());

    }
}
