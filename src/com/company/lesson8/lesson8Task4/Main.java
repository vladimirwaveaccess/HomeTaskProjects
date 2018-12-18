package com.company.lesson8.lesson8Task4;

import java.util.Collection;
import java.util.HashSet;

import static com.company.lesson8.lesson8Task4.Methods.getCoast;

/**
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на
 * свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько
 * цветов разного типа. Также подсчитать количество проданных цветов (используем статическую переменную).
 */
public class Main {
    public static void main(String[] args) {
        Flower[] buket1 = new Flower[7];
        Flower[] buket2 = new Flower[5];
        Flower[] buket3 = new Flower[3];

        buket1[0] = new Astra("Ukraine", 5, 11, "Red");
        buket1[1] = new Astra("Ukraine", 5, 11, "Red");
        buket1[2] = new Astra("Ukraine", 5, 11, "Red");
        buket1[3] = new Carnations("Poland", 10, 21.9, "Red");
        buket1[4] = new Carnations("Poland", 10, 21.9, "Red");
        buket1[5] = new Carnations("Poland", 10, 21.9, "Red");
        buket1[6] = new Tulips("Holland", 21, 33.3, "Red");

        buket2[0] = new Astra("Ukraine", 5, 11, "Red");
        buket2[1] = new Astra("Ukraine", 5, 11, "Red");
        buket2[2] = new Carnations("Poland", 10, 21.9, "Red");
        buket2[3] = new Carnations("Poland", 10, 21.9, "Red");
        buket2[4] = new Carnations("Holland", 21, 33.33, "Red");

        buket3[0] = new Rose("Germany", 30, 50.9, "White");
        buket3[1] = new Rose("Germany", 30, 50.9, "White");
        buket3[2] = new Rose("Germany", 30, 50.9, "White");


        System.out.println("The price of the first bouquet - " + getCoast(buket1));
        System.out.println("The price of the second bouquet - " + getCoast(buket2));
        System.out.println("The price of the third bouquet - " + getCoast(buket3));

        System.out.printf("Total sold %d flowers\n", Flower.getCountInstance());

        System.out.println("First bouquet:");
        for (Flower flower : buket1) {
            System.out.println(flower.toString());
        }

        System.out.println("Second bouquet:");
        for (Flower flower : buket2) {
            System.out.println(flower.toString());
        }

        System.out.println("Third bouquet:");
        for (Flower flower : buket3) {
            System.out.println(flower.toString());
        }


    }
}
