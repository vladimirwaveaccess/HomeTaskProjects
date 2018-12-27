package com.company.lesson10.lesson10Task4;

public class Pants extends Clothes implements MenClothes, WomenClothes {
    public Pants(SizeOfClothes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Pants " + super.toString();
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
