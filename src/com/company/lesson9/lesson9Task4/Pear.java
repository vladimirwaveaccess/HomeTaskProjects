package com.company.lesson9.lesson9Task4;

import java.util.Objects;

public class Pear extends Fruit {
    private String sort;
    private double pricePerKg;
    private static double count = 0;

    public Pear(double weight, String sort, double pricePerKg) {
        super(weight);
        this.sort = sort;
        this.pricePerKg = pricePerKg;
        count += getCoast();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pear pear = (Pear) o;
        return Double.compare(pear.pricePerKg, pricePerKg) == 0 &&
                Objects.equals(sort, pear.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort, pricePerKg);
    }

    @Override
    public String toString() {
        return "Груша{" +
                "сорт = '" + getSort() + '\'' +
                ", цена за кг = " + getPricePerKg() + super.toString();
    }

    @Override
    public double getCoast() {
        return getWeight() * getPricePerKg();
    }

    static double getCountInstance() {
        return count;
    }
}
