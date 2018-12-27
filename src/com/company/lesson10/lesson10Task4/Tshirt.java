package com.company.lesson10.lesson10Task4;

public class Tshirt extends Clothes implements MenClothes, WomenClothes {

    public Tshirt(SizeOfClothes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tshirt " + super.toString();
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
