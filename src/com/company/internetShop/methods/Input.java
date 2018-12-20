package com.company.internetShop.methods;

import com.company.internetShop.common.Constants;

import java.util.Scanner;

public class Input {
    public static String inputString(Scanner sc) {
        String str;
        try {
            str = sc.nextLine();
        } catch (Exception e) {
            str = Constants.ERROR_MESSAGE;
        }
        return str;
    }
}
