package com.company.lesson8.lesson8Task5;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(vision, cat.vision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vision);
    }

    @Override
    public String toString() {
        return "Cat{ " +
                super.toString() +
                ", vision = " + getVision() +
                "}";
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-Meow!");
    }

    @Override
    public void eat() {
        System.out.println("I want milk!");
    }

}
