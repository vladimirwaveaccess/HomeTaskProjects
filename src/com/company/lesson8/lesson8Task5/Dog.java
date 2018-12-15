package com.company.lesson8.lesson8Task5;

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
    public void makeNoise() {
        System.out.println("Gav-Gav!");
    }

    @Override
    public void eat() {
        System.out.println("I want bones");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
