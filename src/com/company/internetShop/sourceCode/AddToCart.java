package com.company.internetShop.sourceCode;

import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceClass.Product;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AddToCart {
    public static Set<Product> getProductNumber(Product[] products, Scanner scanner) {
        OutputMenuElement.outputAllGoods(products);
        System.out.print("Input number of product >");
        return addProduct(products, scanner);
    }

    private static Set<Product> addProduct(Product[] products, Scanner scanner) {
        Set<Product> userBasket = new HashSet<Product>();
        userBasket.add(products[Input.getIntegerValue(scanner) - 1]);
        return userBasket;
    }
}
