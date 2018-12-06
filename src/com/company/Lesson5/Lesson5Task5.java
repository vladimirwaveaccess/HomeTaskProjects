package com.company.Lesson5;

/**
 * Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.
 */

public class Lesson5Task5 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println("Task"+ ++i);
        }
    }
}
