package com.company.lesson16.lesson16Task4;

import java.util.HashSet;
import java.util.Set;

/**
 * Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и пересечения
 * множеств. Протестируйте работу этих методов на предварительно заполненных множествах.
 */
public class listDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(1);
        set2.add(7);
        set2.add(3);
        set2.add(8);
        set2.add(5);

        set3.add(1);
        set3.add(9);
        set3.add(3);
        set3.add(10);
        set3.add(5);

        System.out.println("Source collections");
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        union(set1, set2, set3);

        System.out.println("Source collections");
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        intersect(set1, set2, set3);
    }


    public static <T> void union(Set<T>... sets) {
        if (sets.length < 2) {
            System.out.println("Must be more than 1 collection");
        } else {
            Set<T> rezSet = new HashSet<>(sets[0]);
            for (Set<T> set : sets) {
                rezSet.addAll(set);
            }
            System.out.printf("Collections after union - %s%n", rezSet);
        }
    }

    public static <T> void intersect(Set<T>... sets) {
        if (sets.length < 2) {
            System.out.println("Must be more than 1 collection");
        } else {
            Set<T> rezSet = new HashSet<>(sets[0]);
            for (Set<T> set : sets) {
                rezSet.retainAll(set);
            }
            System.out.printf("Collections after intersect - %s%n", rezSet);
        }
    }
}
