package com.company.lesson16.lesson16Task5;

import com.company.methods.Input;

import java.util.HashSet;
import java.util.Set;

/**
 * Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в
 * строке и вывести результат на экран.
 */
public class RemoveRepeatedNumbers {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static Set<String> getNumber() {
        Set<String> set = new HashSet<>();
        System.out.print("Input numbers >");
        String[] strings = Input.inputString().split(",");
        for (String str : strings) {
            set.add(str.trim());
        }
        return set;
    }
}
