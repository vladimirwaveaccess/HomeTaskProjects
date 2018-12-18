package com.company.lesson8.lesson8Task5;

import java.util.Objects;

/**
 * Dog переопределяют методы makeNoise, eat. Добавьте переменные в класс Dog характеризующие только этих животных.
 */
public class Dog extends Animal {
    private String smell;

    public Dog(String food, String location, String smell) {
        super(food, location);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(smell, dog.smell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smell);
    }

    @Override
    public String toString() {
        return "Dog{ " +
                super.toString() +
                ", smell = " + getSmell() +
                "}";
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav-Gav!");
    }

    @Override
    public void eat() {
        System.out.println("I want bones");
    }

}
