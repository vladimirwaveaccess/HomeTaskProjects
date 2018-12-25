package com.company.internetShop.sourceClass;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Создать класс Basket, содержащий массив купленных товаров.
 */
public class Basket {
    private Set<Product> products = new HashSet<>();

    public Basket(Set<Product> products) {
        this.products = products;
    }

    public Basket() {
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + getProducts() +
                '}';
    }
}
