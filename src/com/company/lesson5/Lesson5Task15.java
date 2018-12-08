package com.company.lesson5;

import java.util.Arrays;

/**
 * Создать табличку для любого массива, в котором последовательно прописать значения i, j, массива для  каждого цикла алгоритма сортировки пузырька. Используйте debugger.
 */
public class Lesson5Task15 {
    public static void main(String[] args) {
        int[] array = {0, 2, 5, 3, 4, 10, 5, 8, 12, 6};
        int[] array1 = {12, 10, 8, 6, 5, 5, 4, 3, 2, 0};
        printHeader();
        sort(array);
        System.out.println("\n");
        printHeader();
        sort(array1);
    }

    /**
     * Метод выводящий шапку таблицы
     */
    private static void printHeader() {
        System.out.println(" i  |  j |           Значение массива       | Выполнился ли блок if");
        System.out.println("----|----|----------------------------------|------------------------");
    }

    /**
     * Метод сортировки пузырьком который выводит таблицу значений массива на каждом шаге
     * @param array - исходный массив для сортировки
     */
    private static void sort(int[] array) {
        String ifDone = "-";

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    ifDone = "+";
                }
                System.out.printf(" %-5d%-5d%-40s%-10s\n", i, j, Arrays.toString(array), ifDone);
                ifDone = "-";
            }
        }
    }
}
