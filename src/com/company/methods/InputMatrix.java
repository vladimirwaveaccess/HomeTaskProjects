package com.company.methods;

import java.util.Scanner;

import static com.company.methods.Input.getDoubleValue;
import static com.company.methods.Input.getIntegerValue;

/**
 * Класс предназначен для ввода матрицы с клавиатуры
 */
public class InputMatrix {

    /**
     * Метод считывает размер матрицы с клавиатуры
     *
     * @param sc - значение с клавиатуры
     * @return - количество линий и столбцов в матрице в виде массива
     */
    public int[] getSizeMatrix(Scanner sc) {
        int[] size = {0, 0};

        System.out.print("Введите количество строк в матрице > ");
        size[0] = getIntegerValue(sc);
        System.out.print("Введите количество столбцов в матрице > ");
        size[1] = getIntegerValue(sc);
        return size;
    }

    /**
     * Метод заполнения матрицы вещественными числами
     *
     * @param size - количество линий и столбцов в матрице в виде массива
     * @param sc - значение с клавиатуры
     * @return - заплненная матрица
     */
    public double[][] fillMatrix(int[] size, Scanner sc) {
        double[][] matrix = new double[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                System.out.printf("Введите элемент в позицию %d%d >", i, j);
                matrix[i][j] = getDoubleValue(sc);
            }
        }
        return matrix;
    }
}
