package com.company.lesson8.lesson8Task4;

import java.util.Objects;

public class Astra extends Flower {
    private String color;

    public Astra(String country, int lifeOfStorage, double price, String color) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Astra astra = (Astra) o;
        return Objects.equals(color, astra.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Astra{ " +
                super.toString() +
                ", color = " + getColor() +
                "}";
    }
}
