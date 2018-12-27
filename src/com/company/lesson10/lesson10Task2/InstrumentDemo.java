package com.company.lesson10.lesson10Task2;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] instruments = {new Gitara(7), new Drum(55.8), new Trumpet(22.4), new Gitara(5), new Drum(60), new Trumpet(30)};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
