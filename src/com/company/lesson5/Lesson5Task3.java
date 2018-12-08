package com.company.lesson5;

/**
 * Передать на вход программы число От 1 до 7 в качестве аргумента. Если число равно 1, выводим на консоль “Понедельник”,
 * 2 –”Вторник” и т.д. Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if.
 */

public class Lesson5Task3 {
    public static void main(String[] args) {
        int dayOfWeek = Integer.parseInt(args[0]);

        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("Weekend");
        }
    }
}
