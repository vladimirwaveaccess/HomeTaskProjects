package com.company.lesson8.lesson8Task3.vehicles;

import com.company.lesson8.lesson8Task3.details.Engine;
import com.company.lesson8.lesson8Task3.professions.Driver;

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
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "Car=" + super.toString() +
                '}';
    }
}
