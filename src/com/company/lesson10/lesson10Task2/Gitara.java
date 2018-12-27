package com.company.lesson10.lesson10Task2;

import java.util.Objects;

public class Gitara implements Instrument {

    private int countOfStrun;

    public Gitara(int countOfStrun) {
        this.countOfStrun = countOfStrun;
    }

    public int getCountOfStrun() {
        return countOfStrun;
    }

    public void setCountOfStrun(int countOfStrun) {
        this.countOfStrun = countOfStrun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gitara gitara = (Gitara) o;
        return countOfStrun == gitara.countOfStrun;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countOfStrun);
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "count of strun = " + countOfStrun +
                '}';
    }

    @Override
    public void play() {
        System.out.printf("%s - play %s\n", KEY, toString());
    }
}
