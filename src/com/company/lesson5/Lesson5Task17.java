package com.company.lesson5;

import java.util.Arrays;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации. Найти максимальное и
 * минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2. Распечатать оба массива.
 */
public class Lesson5Task17 {
    public static void main(String[] args) {
        int[][] array = {
                {11, 2, 23, 54, 15, 6, 77, 48},
                {15, 267, 31, 24, 35, 14, 57, 68},
                {100, 29, 83, 47, 65, 65, 47, 83},
                {110, 22, 93, 48, 75, 66, 57, 84},
                {454, 232, 983, 194, 235, 546, 377, 801}
        };

        System.out.println("Исходный массив => " + Arrays.deepToString(array));
        System.out.println("Массив минимальных и максимальных значений в каждой строке => " + Arrays.deepToString(concatMinMax(findMin(array), findMax(array))));
    }

    /**
     * Метод находящий минимальное значение в каждой строке двухмерного массива
     *
     * @param array - исходный двухмерный массив
     * @return - одномерный массив содержащий минимальные значения в каждой строке
     */
    private static int[] findMin(int[][] array) {
        int[] arrayMin = new int[array.length];
        int minElement;

        for (int i = 0; i < array.length; i++) {
            minElement = array[i][0];
            for (int element : array[i]) {
                if (element < minElement) {
                    minElement = element;
                }
            }
            arrayMin[i] = minElement;
        }
        return arrayMin;
    }

    /**
     * Метод находящий минимальное значение в каждой строке двухмерного массива
     *
     * @param array - исходный двухмерный массив
     * @return - одномерный массив содержащий максимальные значения в каждой строке
     */
    private static int[] findMax(int[][] array) {
        int[] arrayMax = new int[array.length];
        int maxElement;

        for (int i = 0; i < array.length; i++) {
            maxElement = array[i][0];
            for (int element : array[i]) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
            arrayMax[i] = maxElement;
        }
        return arrayMax;
    }

    /**
     * Метод объединяющий одномерные массивы минимальных и максимальных значений в один двухмерный массив
     *
     * @param minElements - одномерный массив содержащий минимальные значения в каждой строке
     * @param maxElements - одномерный массив содержащий максимальные значения в каждой строке
     * @return - двухмерный массив содержащий минимальные и максимальные значения каждой строки
     */
    private static int[][] concatMinMax(int[] minElements, int[] maxElements) {
        int[][] rezArray = new int[minElements.length][2];

        for (int i = 0; i < rezArray.length; i++) {
            rezArray[i][0] = minElements[i];
            rezArray[i][1] = maxElements[i];
        }
        return rezArray;
    }
}
