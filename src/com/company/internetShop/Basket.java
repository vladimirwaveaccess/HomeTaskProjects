package com.company.internetShop;

import java.util.Arrays;

/**
 * Создать класс Basket, содержащий массив купленных товаров.
 */
public class Basket {
    private Product[] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Arrays.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(products);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(getProducts()) +
                '}';
    }
}
