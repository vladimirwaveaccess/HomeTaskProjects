package com.company.lesson12.lesson12Task4;

/**
 * Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */
public class MiddleValues {
    public static void main(String[] args) {
        String[] strings = {"string", "code", "Practice", "qwertyu"};
        for (String str : strings) {
            if (str.length() % 2 == 0) {
                System.out.printf("Исходная строка:%n%s%n", str);
                System.out.printf("Преобразованная строка:%n%s%n", middleValue(str));
            }
        }
    }

    /**
     * Метод возвращающий два средних знака
     *
     * @param sourceString - исходная строка
     * @return - 2 средних символа
     */
    public static String middleValue(String sourceString) {

        return sourceString.substring(sourceString.length() / 2 - 1, sourceString.length() / 2 + 1);
    }
}
