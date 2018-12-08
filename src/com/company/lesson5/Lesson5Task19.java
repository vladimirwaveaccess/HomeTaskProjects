package com.company.lesson5;

import java.util.Arrays;

import static com.company.methods.SelectionSorter.sort;

/**
 * Создать программу для сортировки массива алгоритмом сортировка выбором
 */
public class Lesson5Task19 {
    public static void main(String[] args) {
        testSort(new int[]{});
        testSort(new int[]{0});
        testSort(new int[]{1, 0});
        testSort(new int[]{3, 7, 1, 0, 41, 10, 5});
    }

    /**
     * Метод выводит на экран массив до сортировки и после, а также вызывает метод сортировки
     * @param array - входящий массив для сортировки
     */
    private static void testSort(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
