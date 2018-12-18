package com.company.lesson8.lesson8Task3;

import com.company.lesson8.lesson8Task3.details.Engine;
import com.company.lesson8.lesson8Task3.professions.Driver;
import com.company.lesson8.lesson8Task3.vehicles.Car;
import com.company.lesson8.lesson8Task3.vehicles.Lorry;
import com.company.lesson8.lesson8Task3.vehicles.SportCar;

import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Car lorry1 = new Lorry("Ford", "PickUp", 4, new Driver(24, "Wild Max", 5), new Engine(270, "Ford"), 5);
        Car lorry2 = new Lorry("Doodge", "PickUp", 4.7, new Driver(27, "Crazy Bill", 4), new Engine(300, "GM"), 7);
        Car sportCar1 = new SportCar("Chevrolet Camaro", "sport car", 2.1, new Driver(22, "Jonathan Smith", 6), new Engine(340, "GM"), 300);
        Car sportCar2 = new SportCar("Ford Mustang", "sport car", 2.0, new Driver(28, "Bruce Willis", 10), new Engine(300, "Ford"), 280);
        Collection cars = new HashSet();

        cars.add(lorry1);
        cars.add(lorry2);
        cars.add(sportCar1);
        cars.add(sportCar2);

        for (Object o : cars) {
            System.out.println(o.toString());
        }
    }
}
