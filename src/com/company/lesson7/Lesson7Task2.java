package com.company.lesson7;

/**
 * Создайте два объекта класса Person. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */

public class Lesson7Task2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Kate", 23);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
