package com.company.lesson14.lesson14Task8;

/**
 * Вызывающий метод для класса MinMax
 */
public class MinMaxDemo {
    public static void main(String[] args) {
        MinMax<Integer> array1 = new MinMax<>(new Integer[]{13, 21, 33, 14, 2});
        MinMax<Double> array2 = new MinMax<>(new Double[]{15.4, 21.1, 33.1, 14.3, 21.0});

        System.out.printf("Исходный массив %s%n", array1);
        System.out.printf("Min element == %s%n", array1.minElement());
        System.out.printf("Max element == %s%n", array1.maxElement());
        System.out.println();
        System.out.printf("Исходный массив %s%n", array2);
        System.out.printf("Min element == %s%n", array2.minElement());
        System.out.printf("Max element == %s%n", array2.maxElement());
    }
}
