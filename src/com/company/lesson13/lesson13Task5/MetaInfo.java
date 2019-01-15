package com.company.lesson13.lesson13Task5;

import java.util.Arrays;

/**
 * Напишите программу, выводящую на консоль всю метаинформацию о выбранном классе.
 */
public class MetaInfo {

    public static void main(String[] args) {
        printInfo(String.class);
        System.out.println();
        printInfo(Double.class);
    }

    public static void printInfo(Class arrayClass) {
        System.out.printf("Class name - %s%n", arrayClass.getName());
        System.out.printf("Is Array? - %s%n", arrayClass.isArray());
        System.out.printf("Is Interface? - %s%n", arrayClass.isInterface());
        System.out.printf("Is Primitive? - %s%n", arrayClass.isPrimitive());
        System.out.printf("Modifiers - %s%n", arrayClass.getModifiers());
        if (arrayClass.isPrimitive()) {
            System.out.println("Method is primitive and doesn't have others parameters");
        } else {
            System.out.printf("Package - %s%n", arrayClass.getPackage());
            System.out.printf("Super class - %s%n", arrayClass.getSuperclass());
            System.out.printf("Declared classes - %s%n", Arrays.toString(arrayClass.getDeclaredClasses()));
            System.out.printf("Declared constructors - %s%n", Arrays.toString(arrayClass.getDeclaredConstructors()));
            System.out.printf("Declared methods - %s%n", Arrays.toString(arrayClass.getDeclaredMethods()));
            System.out.printf("Declared fields - %s%n", Arrays.toString(arrayClass.getDeclaredFields()));
            System.out.printf("Classes - %s%n", Arrays.toString(arrayClass.getClasses()));
            System.out.printf("Constructors - %s%n", Arrays.toString(arrayClass.getConstructors()));
            System.out.printf("Methods - %s%n", Arrays.toString(arrayClass.getMethods()));
            System.out.printf("Fields - %s%n", Arrays.toString(arrayClass.getFields()));
        }

    }
}
