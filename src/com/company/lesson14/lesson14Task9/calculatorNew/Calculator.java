package com.company.lesson14.lesson14Task9.calculatorNew;

import java.text.NumberFormat;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
 * subtraction. Параметры этих методов  - два числа одного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static <T extends Number, V extends Number> void sum(T x, V y) {
        System.out.println(x.getClass().getName());
        switch ((detectionOfType(x))) {
            case "Integer":
                System.out.printf("%s + %s = %s%n", x, y, new IntNum().sum(x.intValue(), y.intValue()));
                break;
            case "Byte":
                System.out.printf("%s + %s = %s%n", x, y, new ByteNum().sum(x.byteValue(), y.byteValue()));
                break;
            case "Float":
                System.out.printf("%s + %s = %s%n", x, y, new FloatNum().sum(x.floatValue(), y.floatValue()));
                break;
            case "Long":
                System.out.printf("%s + %s = %s%n", x, y, new LongNum().sum(x.longValue(), y.longValue()));
                break;
            case "Short":
                System.out.printf("%s + %s = %s%n", x, y, new ShortNum().sum(x.shortValue(), y.shortValue()));
                break;
            case "Double":
                System.out.printf("%s + %s = %s%n", x, y, new DoubleNum().sum(x.doubleValue(), y.doubleValue()));
                break;
        }
    }

    public static <T extends Number, V extends Number> void multiply(T x, V y) {
        System.out.println(x.getClass().getName());
        switch ((detectionOfType(x))) {
            case "Integer":
                System.out.printf("%s * %s = %s%n", x, y, new IntNum().multiply(x.intValue(), y.intValue()));
                break;
            case "Byte":
                System.out.printf("%s * %s = %s%n", x, y, new ByteNum().multiply(x.byteValue(), y.byteValue()));
                break;
            case "Float":
                System.out.printf("%s * %s = %s%n", x, y, new FloatNum().multiply(x.floatValue(), y.floatValue()));
                break;
            case "Long":
                System.out.printf("%s * %s = %s%n", x, y, new LongNum().multiply(x.longValue(), y.longValue()));
                break;
            case "Short":
                System.out.printf("%s * %s = %s%n", x, y, new ShortNum().multiply(x.shortValue(), y.shortValue()));
                break;
            case "Double":
                System.out.printf("%s * %s = %s%n", x, y, new DoubleNum().multiply(x.doubleValue(), y.doubleValue()));
                break;
        }
    }

    public static <T extends Number, V extends Number> void divide(T x, V y) {
        System.out.println(x.getClass().getName());
        switch ((detectionOfType(x))) {
            case "Integer":
                System.out.printf("%s / %s = %s%n", x, y, new IntNum().divide(x.intValue(), y.intValue()));
                break;
            case "Byte":
                System.out.printf("%s / %s = %s%n", x, y, new ByteNum().divide(x.byteValue(), y.byteValue()));
                break;
            case "Float":
                System.out.printf("%s / %s = %s%n", x, y, new FloatNum().divide(x.floatValue(), y.floatValue()));
                break;
            case "Long":
                System.out.printf("%s / %s = %s%n", x, y, new LongNum().divide(x.longValue(), y.longValue()));
                break;
            case "Short":
                System.out.printf("%s / %s = %s%n", x, y, new ShortNum().divide(x.shortValue(), y.shortValue()));
                break;
            case "Double":
                System.out.printf("%s / %s = %s%n", x, y, new DoubleNum().divide(x.doubleValue(), y.doubleValue()));
                break;
        }
    }

    public static <T extends Number, V extends Number> void subtraction(T x, V y) {
        System.out.println(x.getClass().getName());
        switch ((detectionOfType(x))) {
            case "Integer":
                System.out.printf("%s - %s = %s%n", x, y, new IntNum().subtraction(x.intValue(), y.intValue()));
                break;
            case "Byte":
                System.out.printf("%s - %s = %s%n", x, y, new ByteNum().subtraction(x.byteValue(), y.byteValue()));
                break;
            case "Float":
                System.out.printf("%s - %s = %s%n", x, y, new FloatNum().subtraction(x.floatValue(), y.floatValue()));
                break;
            case "Long":
                System.out.printf("%s - %s = %s%n", x, y, new LongNum().subtraction(x.longValue(), y.longValue()));
                break;
            case "Short":
                System.out.printf("%s - %s = %s%n", x, y, new ShortNum().subtraction(x.shortValue(), y.shortValue()));
                break;
            case "Double":
                System.out.printf("%s - %s = %s%n", x, y, new DoubleNum().subtraction(x.doubleValue(), y.doubleValue()));
                break;
        }
    }

    private static String detectionOfType(Number number) {
        String rezStr = "";
        for (String str : number.getClass().getName().split("\\.")) {
            rezStr = str;
        }
        return rezStr;
    }
}
