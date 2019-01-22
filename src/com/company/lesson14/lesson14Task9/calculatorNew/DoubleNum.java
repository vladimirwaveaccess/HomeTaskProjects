package com.company.lesson14.lesson14Task9.calculatorNew;

public class DoubleNum implements Num<Double, Double> {
    @Override
    public Double sum(Double x, Double y) {
        return x + y;
    }

    @Override
    public Double subtraction(Double x, Double y) {
        return x - y;
    }

    @Override
    public Double multiply(Double x, Double y) {
        return x * y;
    }

    @Override
    public Double divide(Double x, Double y) {
        return x / y;
    }
}
