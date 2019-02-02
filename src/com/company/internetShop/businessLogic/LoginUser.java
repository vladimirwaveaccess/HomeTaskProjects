package com.company.internetShop.businessLogic;

import com.company.internetShop.common.*;
import com.company.internetShop.model.User;
import java.util.NavigableMap;

public class LoginUser {
    /**
     * Метод инициализирует переменные логин и пароль в переменной User user
     *
     * @return - возвращает переменную User user с заполненными переменными логин и пароль
     */
    private static User getUserCredentials() {
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

    public static User authorization(NavigableMap<String, User> dbUsers) {
        User user;
        String confimPassword;
        while (true) {
            user = LoginUser.getUserCredentials();
            if (dbUsers.containsKey(user.getLogin())) {
                if (verifyPassword(dbUsers.get(user.getLogin()), user)) {
                    System.out.println(Constants.WELCOME_MESSAGE);
                    break;
                } else {
                    System.out.println(Constants.INCORRECT_PASSWORD);
                    ScannerUtility.continueAuthorization();
                    ScannerUtility.clscr();
                    ScannerUtility.clrScanner();
                }
            } else {
                ScannerUtility.clscr();
                System.out.print("Input password once again to add you to our DB >");
                confimPassword = ScannerUtility.inputString();
                if (confirmCredentionals(user.getLogin(), user.getPassword(), confimPassword)) {
                    break;
                } else {
                    System.out.println("Try again!");
                    ScannerUtility.continueAuthorization();
                    ScannerUtility.clscr();
                    ScannerUtility.clrScanner();
                }
            }
        }
        return user;
    }

    private static boolean verifyPassword(User userDB, User user) {
        return userDB.getPassword().equals(user.getPassword());
    }

    private static boolean confirmCredentionals(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login longer than 20 symbols!!!");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwod > 20 or password != confimPassword!!!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("Login %s, password %s, confPassword %s%n", login, password, confirmPassword);
        }
        return true;
    }
}
