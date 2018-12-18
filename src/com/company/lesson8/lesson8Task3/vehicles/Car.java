package com.company.lesson8.lesson8Task3.vehicles;

import com.company.lesson8.lesson8Task3.details.Engine;
import com.company.lesson8.lesson8Task3.professions.Driver;

import java.util.Objects;

/**
 * Создать класс Car в пакете com.company.vehicles
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
 * "Поворот направо" или "Поворот налево". А также метод printInfo(), который выводит полную информацию об автомобиле,
 * ее водителе и моторе.
 */
public class Car {
    private String marka;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String marka, String carClass, double weight, Driver driver, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.weight, weight) == 0 &&
                Objects.equals(marka, car.marka) &&
                Objects.equals(carClass, car.carClass) &&
                Objects.equals(driver, car.driver) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, carClass, weight, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                " marka = '" + marka + '\'' +
                ", carClass = '" + carClass + '\'' +
                ", weight = " + weight +
                ", " + driver.toString() +
                ", " + engine.toString() +
                '}';
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
