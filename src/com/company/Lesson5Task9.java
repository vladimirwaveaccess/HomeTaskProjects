package com.company;

/**
 * Реализовать подсчет факториала используя цикл for.
 * Число n задается случайным образом (используйте Math.random()).
 */

public class Lesson5Task9 {
    public static void main(String[] args) {
        int n = getRandomValue(20);
        long factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + n + " == " + factorial);
    }

    /**
     * Метод вычисляющий рандомно целое число
     * @param i - верхняя граница
     * @return - рандомное целое число
     */
    private static int getRandomValue(int i) {
        return (int) (Math.random() * i);
    }
}
