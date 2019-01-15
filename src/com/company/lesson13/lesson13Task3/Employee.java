package com.company.lesson13.lesson13Task3;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Добавить переменную LocalDate salaryDate в класс Employee
 */
public class Employee {
    private String fullname;
    private double salary;
    private LocalDate salaryDate;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate() {
        this.salaryDate = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                fullname.equals(employee.fullname) &&
                Objects.equals(salaryDate, employee.salaryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, salary, salaryDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                " fullname = '" + getFullname() + '\'' +
                ", salary = " + getSalary() +
                ", salaryDate = " + getSalaryDate() +
                '}';
    }
}
