package com.company.lesson14.lesson14Task9.calculatorNew;

public class ByteNum implements Num<Byte, Byte> {
    @Override
    public Byte sum(Byte x, Byte y) {
        return (byte) (x + y);
    }

    @Override
    public Byte divide(Byte x, Byte y) {
        return (byte) (x / y);
    }

    @Override
    public Byte multiply(Byte x, Byte y) {
        return (byte) (x * y);
    }

    @Override
    public Byte subtraction(Byte x, Byte y) {
        return (byte) (x - y);
    }
}
