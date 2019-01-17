package com.company.lesson14.lesson14Task9;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
 * subtraction. Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static <T extends Number, V extends Number> void sum(T x, V y) {
        System.out.printf("%s + %s = %s%n", x, y, x.doubleValue() + y.doubleValue());
    }

    public static <T extends Number, V extends Number> void multiply(T x, V y) {
        System.out.printf("%s * %s = %s%n", x, y, x.doubleValue() * y.doubleValue());
    }

    public static <T extends Number, V extends Number> void divide(T x, V y) {
        System.out.printf("%s / %s = %s%n", x, y, x.doubleValue() / y.doubleValue());
    }

    public static <T extends Number, V extends Number> void subtraction(T x, V y) {
        System.out.printf("%s - %s = %s%n", x, y, x.doubleValue() - y.doubleValue());
    }
}
