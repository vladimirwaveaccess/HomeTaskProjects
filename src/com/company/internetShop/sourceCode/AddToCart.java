package com.company.internetShop.sourceCode;

import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceClass.Product;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AddToCart {
    /**
     * Метод выводит список всех имеющихся товаров на экран и добавляет товары в корзину выбранные пользователем
     * до тех пор пока пользователь не выйдет из режима добавления товаров
     *
     * @param products - массив имеющихся продуктов
     * @param scanner  - переменная для считывания введенных данных пользователем
     * @return - возвращает коллекцию добавленных товаров
     */
    public static Set<Product> getProductNumber(Product[] products, Scanner scanner) {
        Set<Product> userBasket = new HashSet<Product>();
        int select;
        do {
            Input.clscr();
            OutputMenuElement.outputAllGoods(products);
            System.out.print("Input number of product >");
            userBasket.add(products[Input.getIntegerValue(scanner) - 1]);
            System.out.print("Enter \"-1\" to exit, enter \"1\" to continue > ");
            select = Input.getIntegerValue(scanner);
        } while (select != -1);
        return userBasket;
    }
}
