package com.company.lesson7;

import com.company.methods.InputMatrix;

import java.util.Scanner;

import static com.company.methods.Input.getIntegerValue;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 *
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать;
 * 4) умножение матриц - по желанию.
 */
public class Lesson7Task3 {
    public static void main(String[] args) {
        double[][] array1 = {
                {33, 34, 12},
                {33, 19, 10},
                {12, 14, 17},
                {84, 24, 51},
                {43, 71, 21}
        };
        double[][] array2 = {
                {10, 11, 34, 55},
                {33, 45, 17, 81},
                {45, 63, 12, 16}
        };
        double[][] array3 = {
                {10, 11, 34, 55},
                {33, 45, 17, 81},
                {45, 63, 12, 16}
        };
        Scanner scanner = new Scanner(System.in);
        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);
        Matrix matrix3 = new Matrix(array3);
        InputMatrix inputMatrix = new InputMatrix();

        System.out.println("Сложить матрицы - введите 1");
        System.out.println("Умножить матрицу на число - введите 2");
        System.out.println("Умножить матрицу на матрицу - введите 3");

        switch (getIntegerValue(scanner)) {
            case 1:
                System.out.println("Сложить стандартные матрицы - введите 1");
                System.out.println("Сложить пользовательские матрицы - введите 2");
                switch (getIntegerValue(scanner)) {
                    case 1:
                        matrix2.print("Матрица 1");
                        matrix3.print("Матрица 2");
                        matrix2.sumMatrix(matrix3);
                        matrix2.print("Сумма матриц");
                        break;
                    case 2:
                        System.out.println("Заполнение первой матрицы:");
                        Matrix matrix4 = new Matrix(inputMatrix.fillMatrix(inputMatrix.getSizeMatrix(scanner), scanner));
                        System.out.println("Заполнение второй матрицы:");
                        Matrix matrix5 = new Matrix(inputMatrix.fillMatrix(inputMatrix.getSizeMatrix(scanner), scanner));
                        if ((matrix4.countRow == matrix5.countRow) && (matrix4.countLines == matrix5.countLines)) {
                            matrix4.print("Матрица 1");
                            matrix5.print("Матрица 2");
                            matrix4.sumMatrix(matrix5);
                            matrix4.print("Сумма матриц");
                        } else {
                            System.out.println("Сложить матрицы не возможно!!! Так как размерность матриц не совпадает");
                        }
                        break;
                    default:
                        System.out.println("Oops!!! Something go wrong!!!");
                        break;
                }
                break;
            case 2:
                System.out.println("Умножить стандартную матрицу на число - введите 1");
                System.out.println("Умножить пользовательскую матрицу на число - введите 2");
                switch (getIntegerValue(scanner)) {
                    case 1:
                        System.out.println("Введите число на которое умножить матрицу >");
                        matrix1.multiplicationByNumber(getIntegerValue(scanner));
                        matrix1.print("Матрица после умножения на число");
                        break;
                    case 2:
                        System.out.println("Заполнение матрицы:");
                        Matrix matrix4 = new Matrix(inputMatrix.fillMatrix(inputMatrix.getSizeMatrix(scanner), scanner));
                        System.out.println("Введите число на которое умножить матрицу >");
                        matrix4.multiplicationByNumber(getIntegerValue(scanner));
                        matrix4.print("Матрица после умножения на число");
                        break;
                    default:
                        System.out.println("Oops!!! Something go wrong!!!");
                        break;
                }
                break;
            case 3:
                System.out.println("Умножить стандартные матрицы - введите 1");
                System.out.println("Умножить пользовательские матрицы - введите 2");
                switch (getIntegerValue(scanner)) {
                    case 1:
                        matrix1.print("Матрица 1");
                        matrix2.print("Матрица 2");
                        Matrix matrix6 = new Matrix(matrix1.multiplicationByMatrix(matrix2));
                        matrix6.print("Умноженные матрицы");
                        break;
                    case 2:
                        System.out.println("Заполнение первой матрицы:");
                        Matrix matrix4 = new Matrix(inputMatrix.fillMatrix(inputMatrix.getSizeMatrix(scanner), scanner));
                        System.out.println("Заполнение второй матрицы:");
                        Matrix matrix5 = new Matrix(inputMatrix.fillMatrix(inputMatrix.getSizeMatrix(scanner), scanner));
                        if (matrix4.countRow == matrix5.countLines) {
                            matrix4.print("Матрица 1");
                            matrix5.print("Матрица 2");
                            Matrix matrix7 = new Matrix(matrix4.multiplicationByMatrix(matrix5));
                            matrix7.print("Умноженные матрицы");
                        } else {
                            System.out.println("Умножить матрицы не возможно!!! Так как количество столбцов первой матрицы не совпадает с количеством строк второй матрицы");
                        }
                        break;
                    default:
                        System.out.println("Oops!!! Something go wrong!!!");
                        break;
                }
                break;
            default:
                System.out.println("Oops!!! Something go wrong!!!");
                break;
        }
    }
}
