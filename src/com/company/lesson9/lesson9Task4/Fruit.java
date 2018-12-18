package com.company.lesson9.lesson9Task4;

import java.util.Objects;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "вес =" + getWeight() + '}';
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract double getCoast();
}
