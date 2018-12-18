package com.company.lesson9.lesson9Task5;

import java.util.Objects;

public class Circle {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Радиус = " + radius;
    }

    public double getSquare() {
        return PI * Math.pow(getRadius(),2);
    }

    public double getCircumference() {
        return 2 * PI * getRadius();
    }
}
