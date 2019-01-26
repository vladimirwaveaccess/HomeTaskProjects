package com.company.lesson16.lesson16Task11;

import java.util.HashMap;
import java.util.Map;

/**
 * Cоздайте класс Pet и его наследников Cat, Dog, Parrot. Создайте отображение из домашних животных, где в качестве
 * ключа выступает имя животного, а в качестве значения класс Pet. Добавьте в отображение разных животных. Создайте
 * метод выводящий на консоль все ключи отображения.
 */
public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> animals = new HashMap<>();

        animals.put("Vasy", new Cat());
        animals.put("Python", new Parrot());
        animals.put("Dogzilla", new Dog());
        animals.put("Sabakevich", new Dog());
        animals.put("Pirate", new Parrot());
        animals.put("Tiger", new Cat());
        animals.put("Black", new Cat());

        System.out.println(animals.keySet());
    }
}
