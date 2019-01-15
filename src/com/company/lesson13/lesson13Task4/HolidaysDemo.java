package com.company.lesson13.lesson13Task4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Распечатать график праздников на текущий год используя форматирование.
 */
public class HolidaysDemo {

    public static void main(String[] args) {
        //Спсиок номеров дней праздников
        ArrayList<Integer> holidays = new ArrayList<Integer>();
        holidays.add(1);
        holidays.add(7);
        holidays.add(67);
        holidays.add(118);
        holidays.add(121);
        holidays.add(129);
        holidays.add(167);
        holidays.add(179);
        holidays.add(236);
        holidays.add(287);
        holidays.add(359);

        int year = 2019;

        for (Integer i : holidays) {
            System.out.println(LocalDate.ofYearDay(year, i));
            printHolidays(LocalDate.ofYearDay(year, i).atTime(LocalTime.of(00, 00, 00)));
        }
    }

    /**
     * Метод выводит на экран дату в разных форматах
     *
     * @param localDateTime - дата которую необходимо вывести
     */
    private static void printHolidays(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy", Locale.getDefault());
        System.out.println(localDateTime.format(formatter));
        formatter = DateTimeFormatter.ofPattern("MMM, dd, EEEE yyyy", Locale.getDefault());
        System.out.println(localDateTime.format(formatter));
        formatter = DateTimeFormatter.ofPattern("MM, dd, EE yy", Locale.getDefault());
        System.out.println(localDateTime.format(formatter));
        System.out.println();
    }
}
