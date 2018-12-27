package com.company.internetShop.sourceCode;

import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceClass.Product;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AddToCart {
    /**
     * Метод выводит список всех имеющихся товаров на экран и вызывает метод addProduct() для добавления товаров в корзину
     *
     * @param products - массив имеющихся продуктов
     * @param scanner  - переменная для считывания введенных данных пользователем
     * @return - возвращает коллекцию добавленных товаров
     */
    public static Set<Product> getProductNumber(Product[] products, Scanner scanner) {
        OutputMenuElement.outputAllGoods(products);
        System.out.print("Input number of product >");
        return addProduct(products, scanner);
    }

    /**
     * Метод добавляющий товары в корзину
     *
     * @param products - массив имеющихся продуктов
     * @param scanner  - переменная для считывания введенных данных пользователем
     * @return - возвращает коллекцию добавленных товаров
     */
    private static Set<Product> addProduct(Product[] products, Scanner scanner) {
        Set<Product> userBasket = new HashSet<Product>();
        userBasket.add(products[Input.getIntegerValue(scanner) - 1]);
        return userBasket;
    }
}
