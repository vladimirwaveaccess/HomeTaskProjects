package com.company.lesson8.lesson8Task5;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(hooves, horse.hooves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hooves);
    }

    @Override
    public String toString() {
        return "Horse{ " +
                super.toString() +
                ", hooves = " + getHooves() +
                "}";
    }

    @Override
    public void makeNoise() {
        System.out.println("Neighing!");
    }

    @Override
    public void eat() {
        System.out.println("I want oats!");
    }

}
