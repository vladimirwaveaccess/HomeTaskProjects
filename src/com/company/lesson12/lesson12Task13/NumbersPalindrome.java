package com.company.lesson12.lesson12Task13;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Предложение состоит из нескольких слов, например: "Если есть хвосты по дз, начните с 1 не сданного задания.
 * 123 324 111 4554". Среди слов, состоящих только из цифр, найти слово-палиндром.
 */
public class NumbersPalindrome {
    public static void main(String[] args) {
        String str = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        System.out.printf("Исходный строка:%n%s%n", str);
        System.out.printf("Число полиндром:%n%s", findPalindromeToString(str).toString());
    }

    /**
     * Метод при помощи регулярного выражения из исходной строки формирует коллекцию числовых слов, вызывает метод который находит и возвращает коллекция полиндромов
     *
     * @param sourceString - исходная строка
     * @return - коллекция содержащая числа полиндромы
     */
    public static ArrayList<String> findPalindromeToString(String sourceString) {
        ArrayList<String> digits = new ArrayList<String>();
        String regex = "(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sourceString);
        while (matcher.find()) {
            digits.add(matcher.group());
        }
        return getPalindrome(digits);
    }

    /**
     * Метод находит числа полиндромы в коллекции чисел
     *
     * @param sourceArray - исходная коллекция чисел
     * @return - коллекция чисел полиндромов
     */
    private static ArrayList<String> getPalindrome(ArrayList<String> sourceArray) {
        ArrayList<String> resultArray = new ArrayList<String>();
        StringBuilder currentString;
        for (String str : sourceArray) {
            currentString = new StringBuilder(str);
            currentString.reverse();
            if (str.equals(currentString.toString())) {
                resultArray.add(str);
            }
        }
        return resultArray;
    }
}
