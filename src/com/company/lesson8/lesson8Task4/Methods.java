package com.company.lesson8.lesson8Task4;

public class Methods {
    public static double getCoast(Flower[] flowers) {
        double coast = 0;

        for (Flower flower : flowers) {
            coast += flower.getPrice();
        }
        return coast;
    }
}
