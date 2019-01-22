package com.company.lesson14.lesson14Task9.calculatorNew;

public class LongNum implements Num<Long, Long> {
    @Override
    public Long sum(Long x, Long y) {
        return x + y;
    }

    @Override
    public Long divide(Long x, Long y) {
        return x / y;
    }

    @Override
    public Long multiply(Long x, Long y) {
        return x * y;
    }

    @Override
    public Long subtraction(Long x, Long y) {
        return x - y;
    }
}
