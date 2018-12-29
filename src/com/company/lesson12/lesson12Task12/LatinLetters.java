package com.company.lesson12.lesson12Task12;

/**
 * Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123 ".
 * Найти количество слов, содержащих только символы латинского алфавита.
 */
public class LatinLetters {
    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123 ";
        System.out.printf("Исходная строка:%n%s%n", str);
        System.out.printf("Количество слов, содержащих только символы латинского алфавита - %d%n", getNumberWordsWithLatinCharacters(str));
    }

    /**
     * Метод находит количество слов, содержащих только символы латинского алфавита.
     *
     * @param sourceString - входящая строка, слова разделены пробелами
     * @return - количество найденных слов
     */
    public static int getNumberWordsWithLatinCharacters(String sourceString) {
        int counter = 0;
        String[] strings = sourceString.split(" ");

        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                counter++;
            }
        }
        return counter;
    }
}
