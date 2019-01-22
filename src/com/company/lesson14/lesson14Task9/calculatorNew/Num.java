package com.company.lesson14.lesson14Task9.calculatorNew;

public interface Num <T extends Number, V extends Number> {
    T sum(T x, V y);
    T divide(T x, V y);
    T multiply(T x, V y);
    T subtraction(T x, V y);
}
