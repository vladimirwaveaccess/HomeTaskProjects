package com.company.internetShop.businessLogic;

import com.company.internetShop.common.ScannerUtility;
import com.company.internetShop.model.User;

public class LoginUser {
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
        login = ScannerUtility.inputString();
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
        password = ScannerUtility.inputString();
        return password;
    }
}
