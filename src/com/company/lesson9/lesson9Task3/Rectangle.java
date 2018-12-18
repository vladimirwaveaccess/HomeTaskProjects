package com.company.lesson9.lesson9Task3;

import java.util.Objects;

public class Rectangle extends Shape {
    private int x1, y1, x2, y2;

    public Rectangle(String color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x1 == rectangle.x1 &&
                y1 == rectangle.y1 &&
                x2 == rectangle.x2 &&
                y2 == rectangle.y2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x1, y1, x2, y2);
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                " x1 = " + getX1() +
                ", y1 = " + getY1() +
                ", x2 = " + getX2() +
                ", y2 = " + getY2() +
                ", " + super.toString() +
                "}";
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle with coordinats of first dote - " + getX1() + " and " + getY1() + ", with " +
                "coordinats of second dote - " + getX2() + " and " + getY2() + ", color " + getColor());
    }
}
