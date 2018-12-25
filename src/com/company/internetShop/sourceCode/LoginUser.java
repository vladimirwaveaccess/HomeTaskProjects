package com.company.internetShop.sourceCode;

import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceClass.User;

import java.util.Scanner;

public class LoginUser {
    private static Scanner scanner = new Scanner(System.in);

    public static User getUserCredentials() {
        return new User(getLogin(), getPassword());
    }

    private static String getLogin() {
        String login;
        System.out.print("\nInput Login: > ");
        login = Input.inputString(scanner);
        return login;
    }

    private static String getPassword() {
        String password;
        System.out.print("\nInput password: >");
        password = Input.inputString(scanner);
        return password;
    }
}
