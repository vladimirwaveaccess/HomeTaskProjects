package com.company.lesson8.lesson8Task5;

/**
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например, может
 * выводить на консоль "Такое-то животное спит".
 */
public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Hello!");
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }
}
