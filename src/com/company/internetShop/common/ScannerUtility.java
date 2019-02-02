package com.company.internetShop.common;

import java.util.Scanner;

public class ScannerUtility {
    private static Scanner scanner = new Scanner(System.in);
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
            str = Constants.ERROR_MESSAGE;
        }
        return str;
    }

    /**
     * Метод считывает с консоли введенное целое число пользователем
     *
     * @return - введенное число пользователем
     */
    public static int getIntegerValue() {
        int x;
        while (true) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println(Constants.ERROR_NOT_INTEGER);
                scanner.next();
            }
        }
        return x;
    }

    /**
     * Imitation of clear screen
     */
    public static void clscr() {
        for (int clear = 0; clear < 1000; clear++) {
            System.out.println("\b");
        }
    }

    /**
     * Imitation of clear screen
     */
    public static void clrScanner() {
        scanner.nextLine();
    }

    /**
     * Метод приостанавливает работу программы чтоб пользователь прочитал выведенные данные.
     * Нажатие клавишы Enter азблокирует работу программы
     */
    public static void continueWork() {
        System.out.println();
        System.out.print(Constants.CONTINUE_MESSAGE);
        getIntegerValue();
    }

    /**
     * Метод приостанавливает работу программы чтоб пользователь прочитал выведенные данные.
     * Нажатие клавишы Enter азблокирует работу программы
     */
    public static void continueAuthorization() {
        System.out.println();
        System.out.print(Constants.CONTINUE_AUTHRIZATION);
        getIntegerValue();
    }
}
