package com.company;

import java.util.Scanner;

/**
 * Переписать гирлянду используя оператор switch для  выбора  нужной операции
 */

public class Lesson5Task8 {
    private static Scanner scanner = new Scanner(System.in);
    private static int select = 0;

    public static void main(String[] args) {

        int gar = -1_431_655_766;
        int runGar = 1;

        System.out.println("Введите 1 для мигающей гирлянды");
        System.out.println("Введите 2 для бегущей гирлянды");
        System.out.println("Введите 3 для проверки первой лампочки");

        select = getIntegerValue(scanner);

        switch (select) {
            case 1:
                System.out.println("Мигающая герлянда:");
                blinkGarland(gar);
                break;
            case 2:
                System.out.println("\nГирлянда в режиме бегущая строка:");
                runTickerMode(runGar);
                break;
            case 3:
                System.out.println("\nПроверка первой лампочки");
                getStateFirstLamp(gar);
                break;
            default:
                System.out.println("Такого пункта не существует!!!");
                break;
        }
    }

    /**
     * Метод выводящий гирлянду на экран
     *
     * @param gar - гирлянда, аргумент типа Integer
     */
    private static void outputOfGarland(int gar) {
        String str;
        char lampSwitchOff = 0x2591;
        char lampSwitchOn = 0x2593;
        char[] masStr = new char[32];
        char[] chArray = Integer.toBinaryString(gar).toCharArray();
        int lenGar = chArray.length - 1;

        //-------------------------------------------- Fill masStr massive -------------------------------------------------
        for (int i = 0; i < 32; i++) {
            masStr[i] = lampSwitchOff;
        }

        int j = 31;
        for (int i = lenGar; i >= 0; i--) {
            masStr[j] = chArray[i];
            j--;
        }

        //--------------------------------------- Change '0' to ░ symbol and '1' to ▓ symbol ------------------------------
        str = String.valueOf(masStr);
        str = str.replace('0', lampSwitchOff);
        str = str.replace('1', lampSwitchOn);

        System.out.println(str);
    }

    /**
     * Метод, который мигает лампочками гирлянды заданное количество раз
     *
     * @param gar - гирлянда, аргумент типа Integer
     */
    private static void blinkGarland(int gar) {
        int blinkGar = gar;
        System.out.println("Количество миганий по умолчанию - введите 1");
        System.out.println("Количество миганий задаёт пользователь - введите 2");

        select = getIntegerValue(scanner);

        switch (select) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    outputOfGarland(blinkGar);
                    blinkGar = ~blinkGar;
                }
                break;
            case 2:
                int count = getIntegerValue(scanner);
                for (int i = 0; i < count; i++) {
                    outputOfGarland(blinkGar);
                    blinkGar = ~blinkGar;
                }
                break;
            default:
                System.out.println("Oops!!!Something gone wrong!!!");
                break;
        }
    }

    /**
     * Метод, который запускает гирлянду в режим бегущей строки
     *
     * @param gar - гирлянда, аргумент типа Integer
     */
    private static void runTickerMode(int gar) {
        int runGar = gar;
        System.out.println("Количество сдвигов по умолчанию - введите 1");
        System.out.println("Количество сдвигов задаёт пользователь - введите 2");

        select = getIntegerValue(scanner);
        switch (select) {
            case 1:
                for (int i = 0; i < 31; i++) {
                    runGar = runGar << 1;
                    outputOfGarland(runGar);
                }

                for (int i = 0; i < 31; i++) {
                    runGar = runGar >>> 1;
                    outputOfGarland(runGar);
                }
                break;
            case 2:
                int count = getIntegerValue(scanner);
                for (int i = 0; i < count; i++) {
                    runGar = runGar << 1;
                    if (runGar == 0) {
                        runGar = 1;
                    }
                    outputOfGarland(runGar);
                }

                for (int i = 0; i < count; i++) {
                    runGar = runGar >>> 1;
                    if (runGar == 0) {
                        runGar = -2147483648;
                    }
                    outputOfGarland(runGar);
                }
                break;
            default:
                System.out.println("Oops!!!Something gone wrong!!!");
                break;
        }
    }

    /**
     * Метод, который выясняет включена ли лампочки на первой позиции
     *
     * @param gar - гирлянда, аргумент типа Integer
     */
    private static void getStateFirstLamp(int gar) {
        int firstLamp = 1;
        System.out.println("Для проверки лампочки у стандартной гирлянды - введите 1");
        System.out.println("Для проверки лампочки у пользовательской гирлянды - введите 2");

        select = getIntegerValue(scanner);

        switch (select) {
            case 1:
                if ((gar & firstLamp) == 1) {
                    outputOfGarland(gar);
                    System.out.println("Первая лампочка горит!");
                } else {
                    outputOfGarland(gar);
                    System.out.println("Первая лампочка не горит!");
                }
                break;
            case 2:
                gar = getIntegerValue(scanner);
                if ((gar & firstLamp) == 1) {
                    outputOfGarland(gar);
                    System.out.println("Первая лампочка горит!");
                } else {
                    outputOfGarland(gar);
                    System.out.println("Первая лампочка не горит!");
                }
                break;
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
        System.out.print("Введите число > ");
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
