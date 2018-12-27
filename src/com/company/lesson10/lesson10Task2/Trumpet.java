package com.company.lesson10.lesson10Task2;

import java.util.Objects;

public class Trumpet implements Instrument {
    private double diametr;

    public Trumpet(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return Double.compare(trumpet.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diametr = " + diametr +
                '}';
    }

    @Override
    public void play() {
        System.out.printf("%s - play %s\n", KEY, toString());
    }
}
