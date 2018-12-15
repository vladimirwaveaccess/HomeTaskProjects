package com.company.lesson8.lesson8Task4;

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
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", lifeOfStorage=" + lifeOfStorage +
                ", price=" + price +
                '}';
    }

    static int getCountInstance() {
        return count;
    }
}
