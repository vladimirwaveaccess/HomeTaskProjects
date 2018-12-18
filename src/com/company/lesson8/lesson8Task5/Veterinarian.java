package com.company.lesson8.lesson8Task5;

/**
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод
 * распечатывает food и location пришедшего на прием животного.
 */
public class Veterinarian {

    public Veterinarian() {
    }

    @Override
    public String toString() {
        return "Veterinarian{}";
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Животное ест - " + animal.getFood() +
                ", животное находится - " + animal.getLocation());
    }
}
