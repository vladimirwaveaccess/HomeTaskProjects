package com.company.lesson14.lesson14Task5;

/**
 * Создать класс Food, содержащий метод public void prepare(Cookable c) { c.cook(); } Создать экземпляр класса Food и
 * вызвать его метод prepare(). На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс
 * Cookable.
 */
public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }

    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Anonymous class");
            }
        };

        food.prepare(cookable);
    }
}
