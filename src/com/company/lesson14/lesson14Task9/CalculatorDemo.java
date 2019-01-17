package com.company.lesson14.lesson14Task9;

/**
 * Вызывающий метод для класса Calculator
 */
public class CalculatorDemo {
    public static void main(String[] args) {

        Integer x = 100;
        Float y = 123.5F;

        Calculator.sum(x, y);
        Calculator.divide(x, y);
        Calculator.multiply(x, y);
        Calculator.subtraction(x, y);
    }
}
