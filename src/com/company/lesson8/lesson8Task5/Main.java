package com.company.lesson8.lesson8Task5;

/**
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле
 * отправляйте их на прием к ветеринару.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[6];
        Veterinarian veterinarian = new Veterinarian();

        animal[0] = new Dog("кости", "Kharkiv", "middle");
        animal[1] = new Cat("молоко", "Kiev", "advance");
        animal[2] = new Horse("овес", "Lviv", "thin");
        animal[3] = new Dog("мясо", "Poltava", "beginner");
        animal[4] = new Cat("рыба", "Dnepr", "middle");
        animal[5] = new Horse("трава", "Kherson", "huge");

        for (Animal element : animal) {
            System.out.println("На прием пришло животное - " + element.toString());
            veterinarian.treatAnimal(element);
        }

        for (Animal element : animal) {
            System.out.print("Guess who says - ");
            element.makeNoise();
        }
    }
}
