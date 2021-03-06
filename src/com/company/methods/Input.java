package com.company.methods;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Метод считывает с консоли введенное целое число пользователем
     *
     * @param sc - аргумент типа Scanner
     * @return - введенное число пользователем
     */
    public static int getIntegerValue(Scanner sc) {
        int x;
//        System.out.print("Введите число > ");
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

    /**
     * Метод считывает с консоли введенное ещественное число пользователем
     *
     * @param sc - аргумент типа Scanner
     * @return - введенное число пользователем
     */
    public static double getDoubleValue(Scanner sc) {
        double x;
        while (true) {
            if (sc.hasNextDouble()) {
                x = sc.nextDouble();
                break;
            } else {
                System.out.println("Value is not double!!! Try again!!!");
                sc.next();
            }
        }
        return x;
    }

    /**
     * Метод считывает с консоли введенню строку пользователем
     *
     * @return - введенная строка пользователем
     */
    public static String inputString() {
        String str;
        try {
            str = scanner.nextLine();
        } catch (Exception e) {
            str = "Oops! Something go wrong!";
        }
        return str;
    }
}
