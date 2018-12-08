package com.company.lesson5;

import java.util.Arrays;

/**
 * Реализовать задачу с гирляндой используя массивы. Для реализации бегущей строки используйте метод System.arraycopy(...);
 */
public class Lesson5Task18 {
    public static void main(String[] args) {

        int gar = -1431655766;
        int runGar = 1;
        char[] array;

        array = createArray(gar);
        System.out.println("Мигающая герлянда:");
        blinkGarland(array, 5);

        array = createArray(runGar);
        System.out.println("\nГирлянда в режиме бегущая строка:");
        runTickerMode(array, 31);
    }

    /**
     * Метод преобразует исходное состояние гирлянды из типа Integer в тип char
     *
     * @param gar - входное значение типа Integer которое необходимо преобразовать
     * @return - возвращает состояние гирлянды в виде массива типа char
     */
    private static char[] createArray(int gar) {
        String str;
        char lampSwitchOff = 0x2591;
        char lampSwitchOn = 0x2593;
        char[] masStr = new char[32];
        char[] chArray = Integer.toBinaryString(gar).toCharArray();

        for (int i = 0; i < 32; i++) {
            masStr[i] = 0x2591;
        }

        System.arraycopy(chArray, 0, masStr, 32 - chArray.length, chArray.length);
        str = String.valueOf(masStr);
        str = str.replace('0', lampSwitchOff);
        str = str.replace('1', lampSwitchOn);
        masStr = str.toCharArray();

        return masStr;
    }

    /**
     * Метод который распечатывает текущее состояние гирлянды
     *
     * @param gar - гирлянда, массив типа char
     */
    private static void outputOfGarland(char[] gar) {
        System.out.println(Arrays.toString(gar));
    }

    /**
     * Метод, который мигает лампочками гирлянды заданное количество раз
     *
     * @param gar   - гирлянда, массив типа char
     * @param count - сколько раз нужно мигнуть
     */
    private static void blinkGarland(char[] gar, int count) {
        for (int i = 0; i < count; i++) {
            outputOfGarland(gar);
            getStateFirstLamp(gar);
            for (int j = 0; j < gar.length; j++) {
                if (gar[j] == 0x2591) {
                    gar[j] = 0x2593;
                } else {
                    gar[j] = 0x2591;
                }
            }
        }
    }

    /**
     * Метод, который запускает гирлянду в режим бегущей строки
     *
     * @param gar   - гирлянда, массив типа char
     * @param count - количество шагов в бегущей строке
     */
    private static void runTickerMode(char[] gar, int count) {

        outputOfGarland(gar);

        for (int i = 0; i < count; i++) {
            System.arraycopy(gar, 1, gar, 0, gar.length - 1);
            gar[31] = 0x2591;
            outputOfGarland(gar);
        }

        for (int i = 0; i < count; i++) {
            System.arraycopy(gar, 0, gar, 1, gar.length - 1);
            gar[0] = 0x2591;
            outputOfGarland(gar);
        }
        getStateFirstLamp(gar);
    }

    /**
     * Метод, который выясняет включена ли лампочки на первой позиции
     *
     * @param gar - гирлянда, массив типа char
     */
    private static void getStateFirstLamp(char[] gar) {

        if (gar[0] == 0x2593) {
            System.out.println("Первая лампочка горит!");
        } else {
            System.out.println("Первая лампочка не горит!");
        }
    }
}
