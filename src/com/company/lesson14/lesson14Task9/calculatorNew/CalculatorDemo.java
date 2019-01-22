package com.company.lesson14.lesson14Task9.calculatorNew;

/**
 * Вызывающий метод для класса Calculator
 */
public class CalculatorDemo {
    public static void main(String[] args) {

        Byte xByte = 100;
        Integer yByte = 123;
        Calculator.sum(xByte, yByte);
        Calculator.divide(xByte, yByte);
        Calculator.multiply(xByte, yByte);
        Calculator.subtraction(xByte, yByte);

        Double xDouble = 100.90;
        Double yDouble = 123.90;
        System.out.println();
        Calculator.sum(xDouble, yDouble);
        Calculator.divide(xDouble, yDouble);
        Calculator.multiply(xDouble, yDouble);
        Calculator.subtraction(xDouble, yDouble);

        Float xFloat = 10.38F;
        Float yFloat = 123F;
        System.out.println();
        Calculator.sum(xFloat, yFloat);
        Calculator.divide(xFloat, yFloat);
        Calculator.multiply(xFloat, yFloat);
        Calculator.subtraction(xFloat, yFloat);

        Integer xInt = 100;
        Integer yInt = 123;
        System.out.println();
        Calculator.sum(xInt, yInt);
        Calculator.divide(xInt, yInt);
        Calculator.multiply(xInt, yInt);
        Calculator.subtraction(xInt, yInt);

        Long xLong = 111L;
        Long yLong = 333L;
        System.out.println();
        Calculator.sum(xLong, yLong);
        Calculator.divide(xLong, yLong);
        Calculator.multiply(xLong, yLong);
        Calculator.subtraction(xLong, yLong);

        Short xShort = 100;
        Short yShort = 123;
        System.out.println();
        Calculator.sum(xShort, yShort);
        Calculator.divide(xShort, yShort);
        Calculator.multiply(xShort, yShort);
        Calculator.subtraction(xShort, yShort);
    }
}
