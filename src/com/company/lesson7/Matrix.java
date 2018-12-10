package com.company.lesson7;

import java.util.Arrays;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 *
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать;
 * 4) умножение матриц.
 */

public class Matrix {
    double[][] matrix;
    int countLines;
    int countRow;

    public Matrix() {
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.countLines = matrix.length;
        this.countRow = matrix[0].length;
    }

    /**
     * Сложение с другой матрицей;
     *
     * @param matrixExt - матрица которая прибавляется
     */
    void sumMatrix(Matrix matrixExt) {
        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < countRow; j++) {
                matrix[i][j] += matrixExt.matrix[i][j];
            }
        }
    }

    /**
     * Умножение на число
     *
     * @param number - число на которое необходимо умножить матрицу
     */
    void multiplicationByNumber(int number) {
        print("Матрица до умножения на число");
        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < countRow; j++) {
                matrix[i][j] *= number;
            }
        }
    }

    /**
     * Умножение матриц
     *
     * @param matrixExt - матрица на которую происходит умножение
     * @return - результат умножения двух матриц
     */
    double[][] multiplicationByMatrix(Matrix matrixExt) {
        double[][] returnMatrix = new double[countLines][matrixExt.countRow];
        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < matrixExt.countRow; j++) {
                for (int k = 0; k < matrixExt.countLines; k++) {
                    returnMatrix[i][j] += matrix[i][k] * matrixExt.matrix[k][j];
                }
            }
        }
        return returnMatrix;
    }

    /**
     * Вывод на печать
     *
     * @param message - сообщение комментирующее вывод
     */
    void print(String message) {
        System.out.println(message + " - " + Arrays.deepToString(this.matrix));
    }
}
