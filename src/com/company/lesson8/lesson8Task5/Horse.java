package com.company.lesson8.lesson8Task5;

/**
 * Horse переопределяют методы makeNoise, eat. Добавьте переменные в класс Horse характеризующие только этих животных.
 */
public class Horse extends Animal {
    private String hooves;

    public Horse(String food, String location, String hooves) {
        super(food, location);
        this.hooves = hooves;
    }

    public String getHooves() {
        return hooves;
    }

    public void setHooves(String hooves) {
        this.hooves = hooves;
    }

    @Override
    public void makeNoise() {
        System.out.println("Neighing!");
    }

    @Override
    public void eat() {
        System.out.println("I want oats!");
    }

    @Override
    public String toString() {
        return "Horse";
    }
}
