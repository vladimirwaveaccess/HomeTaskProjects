package com.company.lesson8.lesson8Task3.vehicles;

import com.company.lesson8.lesson8Task3.details.Engine;
import com.company.lesson8.lesson8Task3.professions.Driver;

import java.util.Objects;

/**
 * Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 */
public class Lorry extends Car {
    private int carrying;

    public Lorry(String marka, String carClass, double weight, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carrying);
    }

    @Override
    public String toString() {
        return "Lorry{ " +
                super.toString() +
                ", carrying = " + carrying +
                '}';
    }
}
