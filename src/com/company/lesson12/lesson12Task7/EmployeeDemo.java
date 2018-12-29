package com.company.lesson12.lesson12Task7;

/**
 * Создать массив содержащий несколько объектов этого типа.
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Ivanov", 26548.368),
                new Employee("Petrov", 45632.789654),
                new Employee("Sidorov", 96325.951236),
        };

        for (Employee employee : employees) {
            Report.generateReport(employee);
        }
    }
}
