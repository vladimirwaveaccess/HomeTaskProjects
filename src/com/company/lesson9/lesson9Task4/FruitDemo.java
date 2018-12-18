package com.company.lesson9.lesson9Task4;

public class FruitDemo {
    public static void main(String[] args) {
        Apple apple1 = new Apple(3.2, "sort1", 22.2);
        Apple apple2 = new Apple(1.6, "sort2", 18.4);
        Apricot apricot1 = new Apricot(2.2, "sort1", 28.4);
        Apricot apricot2 = new Apricot(2.6, "sort2", 33.4);
        Pear pear1 = new Pear(3, "sort1", 15.6);
        Pear pear2 = new Pear(2.5, "sort2", 25.6);
        Fruit[] fruits = {apple1, apple2, apricot1, apricot2, pear1, pear2};

        for (Fruit fruit : fruits) {
            System.out.println(fruit.toString() + ", стоимость = " + fruit.getCoast());
        }

        System.out.println("Стоимость всех проданных яблок = " + Apple.getCountInstance());
        System.out.println("Стоимость всех проданных груш = " + Pear.getCountInstance());
        System.out.println("Стоимость всех проданных абрикос = " + Apricot.getCountInstance());
        System.out.println("Общая стоимость проданных фруктов = " + (Apple.getCountInstance() + Apricot.getCountInstance() + Pear.getCountInstance()));
    }
}
