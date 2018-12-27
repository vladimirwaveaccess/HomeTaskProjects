package com.company.internetShop.methods;

import java.util.Scanner;

public class Methods {
    /**
     * Метод приостанавливает работу программы чтоб пользователь прочитал выведенные данные.
     * Нажатие клавишы Enter азблокирует работу программы
     */
    public static void ContinueWork() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Для продолжения нажмите клавишу \"Enter\"");
        Input.inputString(scanner);
    }
}
