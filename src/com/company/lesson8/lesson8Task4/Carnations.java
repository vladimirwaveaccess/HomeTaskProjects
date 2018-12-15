package com.company.lesson8.lesson8Task4;

public class Carnations extends Flower {
    private String color;

    public Carnations(String country, int lifeOfStorage, double price, String color) {
        super(country, lifeOfStorage, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carnations{" +
                "color='" + color + '\'' +
                ", Flower=" + super.toString() +
                '}';
    }
}
