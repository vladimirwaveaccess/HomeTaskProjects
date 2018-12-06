package com.company.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Methods.Input.getIntegerValue;

/**
 * Изменить программу сортировки пузырьком:
 */
public class Lesson5Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0, 2, 5, 3, 4, 10, 5, 8, 12, 6};

        System.out.println("Метод пузырька с досрочным окончанием - введите 1");
        System.out.println("Метод пузырька в обратном порядке - введите 2");

        int select = getIntegerValue(scanner);

        switch (select) {
            case 1:
                System.out.println("Исходный массив => " + Arrays.toString(array));
                earlyTerminationOfSorting(array);
                break;
            case 2:
                System.out.println("Исходный массив => " + Arrays.toString(array));
                sortReverse(array);
                break;
            default:
                System.out.println("Oops! Something gone wrong!!!");
        }
    }

    /**
     * а) Метод сортировки пузырьком с возможность досрочного окончания сортировки
     *
     * @param array - массив для сортировки
     */
    private static void earlyTerminationOfSorting(int[] array) {
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                System.out.printf("Сортировка закончена досрочно на %d проходе!!!\n", i + 1);
                break;
            }
            flag = false;
        }
        System.out.println("Отсортированный массив => " + Arrays.toString(array));
    }

    /**
     * б) Метод сортировки пузырьком в котором минимальный элемент "всплывает" в конец массива.
     *
     * @param array - массив для сортировки
     */
    private static void sortReverse(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив => " + Arrays.toString(array));
    }
}
