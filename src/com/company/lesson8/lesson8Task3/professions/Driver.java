package com.company.lesson8.lesson8Task3.professions;

/**
 * Пусть класс Driver расширяет класс Person.
 * Класс Driver содержит поля - стаж вождения.
 */
public class Driver extends Person {
    private int experience;

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                "Person=" + super.toString() +
                '}';
    }
}
