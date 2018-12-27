package com.company.lesson10.lesson10Task4;

import java.util.Objects;

public abstract class Clothes {
    private SizeOfClothes size;
    private double price;
    private String color;

    public Clothes(SizeOfClothes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public SizeOfClothes getSize() {
        return size;
    }

    public void setSize(SizeOfClothes size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Double.compare(clothes.price, price) == 0 &&
                size == clothes.size &&
                Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price, color);
    }

    @Override
    public String toString() {
        return "Clothe{" +
                "size = " + size +
                ", price = " + price +
                ", color = '" + color + '\'' +
                '}';
    }
}
