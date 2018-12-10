package com.company.lesson7;

import java.util.Scanner;

import static com.company.methods.Input.getIntegerValue;

/**
 * Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или
 * в порядке убывания в противном случае. Использовать рекурсию.
 */
public class Lesson7Task5 {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число > ");
        int digitA = getIntegerValue(scanner);
        System.out.print("Введите второе целое число > ");
        int digitB = getIntegerValue(scanner);

        if (digitA < digitB) {
            System.out.printf("Числа в порядке возрастания от %d до %d:\n", digitA, digitB);
            recursion.increaseRecursion(digitA, digitB);
        } else if (digitA > digitB) {
            System.out.printf("Числа в порядке убывания от %d до %d:\n", digitA, digitB);
            recursion.decreaseRecursion(digitA, digitB);
        } else {
            System.out.println("Числа равны, вывод не возможен!!! Попробуйте в следующий раз!!!");
        }
    }
}
