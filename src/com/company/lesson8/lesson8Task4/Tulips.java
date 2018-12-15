package com.company.lesson8.lesson8Task4;

public class Tulips extends Flower{
    private String color;

    public Tulips(String country, int lifeOfStorage, double price, String color) {
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
        return "Tulips{" +
                "color='" + color + '\'' +
                ", Flower=" + super.toString() +
                '}';
    }
}
