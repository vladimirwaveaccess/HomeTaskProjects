package com.company.lesson12.lesson12Task7;

/**
 * Создать класс Report, который будет содержать статический метод generateReport, в котором выводится информация о зарплате всех сотрудников. Используйте форматировании строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой
 */
public class Report {
    public Report() {
    }

    @Override
    public String toString() {
        return "Report{}";
    }

    public static void generateReport(Employee employee) {
        System.out.printf("Зарплата %15s равна %15.2f%n", employee.getFullname(), employee.getSalary());
    }
}
