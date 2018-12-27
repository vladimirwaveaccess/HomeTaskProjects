package com.company.lesson10.lesson10Task4;

public class Tie extends Clothes implements MenClothes {
    public Tie(SizeOfClothes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie " + super.toString();
    }

    @Override
    public void dressMan() {

    }
}
