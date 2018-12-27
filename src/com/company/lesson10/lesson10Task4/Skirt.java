package com.company.lesson10.lesson10Task4;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(SizeOfClothes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt " + super.toString();
    }

    @Override
    public void dressWomen() {

    }
}
