package com.company.lesson15;

/**
 * Создать класс Food, содержащий метод public void prepare(Cookable c) { c.cook(String str); }
 * Используя лямбда выражения вывести на экран надпись
 */
public class Food {
    public static void main(String[] args) {

        Cookable cookable1 = str -> System.out.println("Лямбда 1");
        cookable1.cook("");
    }
}
