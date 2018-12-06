package com.company.Methods;

public class SelectionSorter {
    /**
     * Метод выполняет сортировку методом "сортировка выбором"
     *
     * @param array - входящий массив для сортировки
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}
