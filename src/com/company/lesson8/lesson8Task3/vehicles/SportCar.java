package com.company.lesson8.lesson8Task3.vehicles;

import com.company.lesson8.lesson8Task3.details.Engine;
import com.company.lesson8.lesson8Task3.professions.Driver;

import java.util.Objects;

/**
 * Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
 */
public class SportCar extends Car {
    private double speed;

    public SportCar(String marka, String carClass, double weight, Driver driver, Engine engine, double speed) {
        super(marka, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return Double.compare(sportCar.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed);
    }

    @Override
    public String toString() {
        return "SportCar{ " +
                super.toString() +
                ", speed = " + speed +
                '}';
    }
}
