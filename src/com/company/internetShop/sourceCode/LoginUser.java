package com.company.internetShop.sourceCode;

import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceClass.User;

import java.util.Scanner;

public class LoginUser {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Метод инициализирует переменные логин и пароль в переменной User user
     *
     * @return - возвращает переменную User user с заполненными переменными логин и пароль
     */
    public static User getUserCredentials() {
        return new User(getLogin(), getPassword());
    }

    /**
     * Метод запрашивате у пользователя логин
     *
     * @return - введенный логин пользователем
     */
    private static String getLogin() {
        String login;
        System.out.print("\nInput Login: > ");
        login = Input.inputString(scanner);
        return login;
    }

    /**
     * Метод запрашивает у пользователя пароль
     *
     * @return - введенный пароль пользователем
     */
    private static String getPassword() {
        String password;
        System.out.print("\nInput password: >");
        password = Input.inputString(scanner);
        return password;
    }
}
