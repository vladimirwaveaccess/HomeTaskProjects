package com.company.lesson9.lesson9Task5;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        Circle[] circles = {circle1, circle2, circle3};

        for (Circle circle: circles) {
            System.out.println("Если " + circle.toString());
            System.out.printf("Площадь = %f\n", circle.getSquare());
            System.out.printf("Длина окружности = %f\n",circle.getCircumference());
            System.out.println();
        }
    }
}
