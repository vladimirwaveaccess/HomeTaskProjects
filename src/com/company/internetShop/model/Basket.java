package com.company.internetShop.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Класс Basket, содержащий массив купленных товаров.
 */
public class Basket {
    private Set<Product> products = new TreeSet<>();
    private LocalDateTime purchaseDate;

    public Basket(Set<Product> products, LocalDateTime purchaseDate) {
        this.products = products;
        this.purchaseDate = purchaseDate;
    }

    public Basket() {
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return products.equals(basket.products) &&
                purchaseDate.equals(basket.purchaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, purchaseDate);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MMMM, yyyy", Locale.getDefault());
        return "Basket{" +
                "products = " + getProducts() +
                ", date of purchase = " + getPurchaseDate().format(formatter) + " of local time" +
                '}';
    }
}
