package com.company.lesson8.lesson8Task3.professions;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(experience);
    }

    @Override
    public String toString() {
        return "Driver{ " +
                "Person = " + super.toString() +
                ", experience = " + experience +
                '}';
    }
}
