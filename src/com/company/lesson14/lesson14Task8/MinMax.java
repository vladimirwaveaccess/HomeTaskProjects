package com.company.lesson14.lesson14Task8;

import java.util.Arrays;

/**
 * Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента
 * массива. Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 *
 * @param <T> - входной массив любого числового типа
 */
public class MinMax<T extends Comparable> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array.clone();
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array.clone();
    }

    public T minElement() {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }

        }
        return min;
    }

    public T maxElement() {
        T max = getArray()[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMax<?> minMax = (MinMax<?>) o;
        return Arrays.equals(array, minMax.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "{ array = " + Arrays.toString(array) + '}';
    }
}
