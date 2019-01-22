package com.company.lesson14.lesson14Task9.calculatorNew;

public class FloatNum implements Num<Float, Float> {
    @Override
    public Float sum(Float x, Float y) {
        return x + y;
    }

    @Override
    public Float divide(Float x, Float y) {
        return x / y;
    }

    @Override
    public Float multiply(Float x, Float y) {
        return x * y;
    }

    @Override
    public Float subtraction(Float x, Float y) {
        return x - y;
    }
}
