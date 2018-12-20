package com.company.internetShop.login;

import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceClass.Basket;
import com.company.internetShop.sourceClass.Product;
import com.company.internetShop.sourceClass.User;

import java.util.Scanner;

public class LoginUser {
    private static Scanner scanner = new Scanner(System.in);
    public static User getUserCredentials() {
        User user = new User(getLogin(), getPassword(), new Basket(new Product[]{new Product("Mouse", 222, 3), new Product("Laptop", 17000, 4)}));
        return user;
    }

    private static String getLogin() {
        String login;
        System.out.print("\nInput login: > ");
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
