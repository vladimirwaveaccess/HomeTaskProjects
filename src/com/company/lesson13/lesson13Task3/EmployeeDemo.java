package com.company.lesson13.lesson13Task3;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Создать массив содержащий несколько объектов этого типа.
 * Заголовок отчета должен изменяться в зависимости от выбранной локали (используем класс ResourceBundle).
 */
public class EmployeeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee[] employees = new Employee[]{
                new Employee("Ivanov", 26548.37568),
                new Employee("Petrov", 45632.789654),
                new Employee("Sidorov", 96325.966236),
        };
        Locale[] locales = {new Locale("", ""), new Locale("en", "US"), new Locale("fr", "FR")};

        for (Employee employee : employees) {
            employee.setSalaryDate();
        }


        for (Locale loc : locales) {
            ResourceBundle rb = ResourceBundle.getBundle("title", loc);
            String value = rb.getString("key1");
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
            for (Employee employee : employees) {
                FullReport.generateReport(employee, loc);
            }
            System.out.println();
        }
    }
}
