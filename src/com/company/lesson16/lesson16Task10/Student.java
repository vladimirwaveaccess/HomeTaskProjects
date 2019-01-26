package com.company.lesson16.lesson16Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 */
public class Student {
    private String name;
    private String groupName;
    private int course;
    private List<Integer> grades;

    public Student(String name, String groupName, int course, List<Integer> grades) {
        this.name = name;
        this.groupName = groupName;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(groupName, student.groupName) &&
                Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, groupName, course, grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}
