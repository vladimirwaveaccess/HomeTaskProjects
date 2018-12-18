package com.company.lesson9.lesson9Task3;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Green", 3, 4, 6);
        Circle circle2 = new Circle("Blue", 6, 9, 56);
        Rectangle rectangle1 = new Rectangle("Red", 6, 9, 15, 25);
        Rectangle rectangle2 = new Rectangle("Black", 1, 1, 33, 33);

        Shape[] shapes = {circle1, circle2, rectangle1, rectangle2};
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }
        System.out.println("Круг один равен кругу два - " + circle1.equals(circle2));
        System.out.println("Прямоуголник один равен прямоугольнику два - " + rectangle1.equals(rectangle2));
    }
}
