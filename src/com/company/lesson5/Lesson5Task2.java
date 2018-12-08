package com.company.lesson5;

import java.util.Scanner;

/**
 * С помощью класса Scanner ввести целое число. Если это число от 0 до 10, вывести на консоль сообщение “Положительное
 * число меньше 10”, иначе вывести сообщение “Положительное число больше 10 или отрицательное”. Используем оператор
 * if-else.
 */

public class Lesson5Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        number = getIntegerValue(scanner);
        if (number >= 0 && number <= 10) {
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }

    /**
     * Метод считывает с консоли введенное целое число пользователем
     *
     * @param sc - аргумент типа Scanner
     * @return - введенное число пользователем
     */
    private static int getIntegerValue(Scanner sc) {
        int x;
        System.out.print("Введите целое число > ");
        while (true) {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                System.out.println("Value is not integer!!! Try again!!!");
                sc.next();
            }
        }
        return x;
    }
}
