package com.company.lesson8.lesson8Task3.vehicles;

import com.company.lesson8.lesson8Task3.details.Engine;
import com.company.lesson8.lesson8Task3.professions.Driver;

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
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "Car=" + super.toString() +
                '}';
    }
}
