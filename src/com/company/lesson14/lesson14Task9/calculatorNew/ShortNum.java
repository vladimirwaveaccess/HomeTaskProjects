package com.company.lesson14.lesson14Task9.calculatorNew;

import java.nio.ShortBuffer;

public class ShortNum implements Num<Short, Short> {
    @Override
    public Short sum(Short x, Short y) {
        return (short) (x + y);
    }

    @Override
    public Short divide(Short x, Short y) {
        return (short) (x / y);
    }

    @Override
    public Short multiply(Short x, Short y) {
        return (short) (x * y);
    }

    @Override
    public Short subtraction(Short x, Short y) {
        return (short) (x - y);
    }
}
