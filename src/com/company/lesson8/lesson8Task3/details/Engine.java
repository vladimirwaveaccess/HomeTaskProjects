package com.company.lesson8.lesson8Task3.details;

import java.util.Objects;

/**
 * Класс Engine содержит поля - мощность, производитель.
 */
public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power &&
                Objects.equals(company, engine.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, company);
    }

    @Override
    public String toString() {
        return "Engine{ " +
                "power = " + power +
                ", company='" + company + '\'' +
                '}';
    }
}
