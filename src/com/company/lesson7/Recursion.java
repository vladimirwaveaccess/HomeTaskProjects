package com.company.lesson7;

public class Recursion {
    /**
     * Метод выводящий числа в порядке возрастания
     *
     * @param digitA - входное число
     * @param digitB - входное число
     */
    void increaseRecursion(int digitA, int digitB) {
        if (digitA > digitB) {
            return;
        } else {
            increaseRecursion(digitA, --digitB);
        }
        System.out.println(digitB + 1);
    }

    /**
     * Метод выводящий числа в порядке убывания
     *
     * @param digitA - входное число
     * @param digitB - входное число
     */
    void decreaseRecursion(int digitA, int digitB) {
        if (digitB > digitA) {
            return;
        } else {
            decreaseRecursion(digitA, ++digitB);
        }
        System.out.println(digitB-1);
    }
}
