package com.company.internetShop.model;

import com.company.internetShop.common.CategoryList;

import java.util.Arrays;
import java.util.Objects;

/**
 * Класс Категория, имеющий переменные имя и массив товаров.
 */
public class Category {
    private CategoryList name;
    private Product[] products;

    public Category(CategoryList name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public CategoryList getName() {
        return name;
    }

    public void setName(CategoryList name) {
        this.name = name;
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
        Category category = (Category) o;
        return name == category.name &&
                Arrays.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name=" + getName() +
                ", products=" + Arrays.toString(getProducts()) +
                '}';
    }
}
