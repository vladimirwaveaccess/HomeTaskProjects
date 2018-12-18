package com.company.lesson8.lesson8Task3.professions;

import java.util.Objects;

/**
 * Класс Person содержит поля - ФИО, возраст.
 */
public class Person{
    private int age;
    private String fullName;

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fullName);
    }

    @Override
    public String toString() {
        return "Person{ " +
                "age = " + age +
                ", fullName = '" + fullName + '\'' +
                '}';
    }
}
