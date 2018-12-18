package com.company.lesson8.lesson8Task4;

import java.util.Objects;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 */
public class Flower {
    private String country;
    private int lifeOfStorage;
    private double price;
    private static int count = 0;

    public Flower(String country, int lifeOfStorage, double price) {
        this.country = country;
        this.lifeOfStorage = lifeOfStorage;
        this.price = price;
        count++;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLifeOfStorage() {
        return lifeOfStorage;
    }

    public void setLifeOfStorage(int lifeOfStorage) {
        this.lifeOfStorage = lifeOfStorage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return lifeOfStorage == flower.lifeOfStorage &&
                Double.compare(flower.price, price) == 0 &&
                Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, lifeOfStorage, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + getCountry() + '\'' +
                ", lifeOfStorage=" + getLifeOfStorage() +
                ", price=" + getPrice() +
                '}';
    }

    static int getCountInstance() {
        return count;
    }
}
