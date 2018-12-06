package com.company.Lesson5;

import java.util.Arrays;

/**
 * Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент уже находится на своем месте.
 */
public class Lesson5Task20 {
    public static void main(String[] args) {
        int[] array = {0, 2, 0, 3, 5, 4, 3};
        System.out.println(Arrays.toString(sort(array)));
    }

    /**
     * Метод сортирующий выбором который не выполняет обмен значений если найденный минимальный элемент уже находится на своем месте.
     *
     * @param array - входящий массив для сортировки
     * @return - отсортированный массив
     */
    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            if (pos != i) {// если элемент уже на своем месте обмен значений не происходит
                array[pos] = array[i];
                array[i] = min;
            }
        }
        return array;
    }
}
