package com.company.lesson8.lesson8Task5;

/**
 * Cat переопределяют методы makeNoise, eat. Добавьте переменные в класс Cat, характеризующие только этих животных.
 */
public class Cat extends Animal {
    private String vision;

    public Cat(String food, String location, String vision) {
        super(food, location);
        this.vision = vision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-Meow!");
    }

    @Override
    public void eat() {
        System.out.println("I want milk!");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
