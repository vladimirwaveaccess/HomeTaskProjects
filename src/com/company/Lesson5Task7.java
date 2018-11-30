package com.company;

/**
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */

public class Lesson5Task7 {
    public static void main(String[] args) {
        char ch = 'h';
        for (int i = 0; i < 5; i++, ch++) {
            System.out.print(ch);
        }
    }
}
