package com.company.lesson5;

/**
 * Передать на вход программы число в качестве аргумента. Если оно нечетное, распечатать его. Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.
 */
public class Lesson5Task1 {

    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) % 2 != 0) {
            System.out.println("Value " + args[0] + " is odd!");
        }
    }
}
