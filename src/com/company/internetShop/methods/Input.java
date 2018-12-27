package com.company.internetShop.methods;

import com.company.internetShop.common.Constants;

import java.util.Scanner;

public class Input {
    /**
     * Метод считывает с консоли введенню строку пользователем
     *
     * @param sc - аргумент типа Scanner
     * @return - введенная строка пользователем
     */
    public static String inputString(Scanner sc) {
        String str;
        try {
            str = sc.nextLine();
        } catch (Exception e) {
            str = Constants.ERROR_MESSAGE;
        }
        return str;
    }

    /**
     * Метод считывает с консоли введенное целое число пользователем
     *
     * @param sc - аргумент типа Scanner
     * @return - введенное число пользователем
     */
    public static int getIntegerValue(Scanner sc) {
        int x;
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
     * Imitation of clear screen
     */
    public static void clscr(){
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }
    }
}
