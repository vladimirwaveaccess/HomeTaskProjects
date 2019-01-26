package com.company.lesson16.lesson16Task10;

import java.util.*;

/**
 * Создать коллекцию, содержащую объекты класса Student. Перебрать всех студентов, вычислить средний балл каждого
 * студента. Если средний балл >=3, студент переводится на следующий курс, иначе отчисляется. Напишите метод
 * printStudents(List students, int course), который получает список студентов и номер курса и печатает на консоль
 * имена тех студентов из списка, которые обучаются на данном курсе. Для обхода списка в этом методе используйте
 * итератор.
 */
public class StudentsDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Set<Integer> courses = new HashSet<>();

        students.add(new Student("Ivanov1", "TRE", 1, new ArrayList<>(Arrays.asList(3, 2, 3, 4, 5))));
        students.add(new Student("Ivanov2", "TRE", 1, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1))));
        students.add(new Student("Ivanov3", "TRE", 2, new ArrayList<>(Arrays.asList(3, 3, 3, 4, 5))));
        students.add(new Student("Ivanov4", "TRE", 2, new ArrayList<>(Arrays.asList(3, 4, 4, 4, 5))));
        students.add(new Student("Ivanov5", "TRE", 3, new ArrayList<>(Arrays.asList(2, 2, 2, 5, 5))));
        students.add(new Student("Ivanov6", "TRE", 3, new ArrayList<>(Arrays.asList(1, 1, 5, 4, 5))));
        students.add(new Student("Ivanov7", "TRE", 4, new ArrayList<>(Arrays.asList(5, 5, 3, 4, 5))));
        students.add(new Student("Ivanov8", "TRE", 4, new ArrayList<>(Arrays.asList(5, 2, 5, 4, 5))));
        students.add(new Student("Ivanov9", "TRE", 5, new ArrayList<>(Arrays.asList(3, 2, 3, 4, 3))));
        students.add(new Student("Ivanov10", "TRE", 5, new ArrayList<>(Arrays.asList(3, 2, 5, 2, 5))));

        printAcademicPerformance(students);

        //Create list of courses
        for (Student student : students) {
            courses.add(student.getCourse());
        }

        for (Integer course : courses) {
            System.out.printf("The next student(s) is(are) study(ies) on the %s course:%n", course);
            printStudents(students, course);
        }
    }

    /**
     * Перебрать всех студентов, вычислить средний балл каждого
     * * студента. Если средний балл >=3, студент переводится на следующий курс, иначе отчисляется.
     *
     * @param students - Входной список студентов
     */
    private static void printAcademicPerformance(List<Student> students) {
        double averageGrade = 0;
        for (Student student : students) {
            for (Integer grade : student.getGrades()) {
                averageGrade += grade;
            }
            averageGrade /= student.getGrades().size();
            if (averageGrade >= 3 && student.getCourse() == 5) {
                System.out.printf("The %s student graduates University and gets a diploma!!!%n", student.getName());
            } else if (averageGrade < 3 && student.getCourse() == 5) {
                System.out.printf("The %s student graduates University and doesn't get a diploma!!!%n", student.getName());
            } else if (averageGrade >= 3 && student.getCourse() < 5) {
                System.out.printf("The %s student is transferred to the next course!!!%n", student.getName());
            } else {
                System.out.printf("The %s student will be expelled!!!%n", student.getName());
            }
        }
    }

    /**
     * Метод получает список студентов и номер курса и печатает на консоль
     * имена тех студентов из списка, которые обучаются на данном курсе.
     *
     * @param students - Входная коллекция студентов
     * @param course   - номер курса
     */
    private static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
