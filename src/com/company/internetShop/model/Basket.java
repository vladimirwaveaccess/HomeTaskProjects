package com.company.internetShop.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Класс Basket, содержащий массив купленных товаров.
 */
public class Basket implements Serializable {
    private SortedSet<Product> products = new TreeSet<>();
    private Date purchaseDate;

    public Basket(SortedSet<Product> products, Date purchaseDate) {
        this.products = products;
        this.purchaseDate = purchaseDate;
    }

    public Basket() {
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(SortedSet<Product> products) {
        this.products = products;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
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
                ", date of purchase = " + getPurchaseDate().toLocalDate().format(formatter) + " of local time" +
                '}';
    }
}
