package com.company.internetShop.businessLogic;

import com.company.internetShop.model.Basket;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class to write the contents of the basket to a file
 */
public class PrintBasketToFile {
    /**
     * Method to write the purchases of the user to a file
     *
     * @param basket - variable which contains data about user purchases
     */
    public static void printToFile(Basket basket) {
        try (PrintWriter printWriter = new PrintWriter("src\\com\\company\\internetShop\\basket.txt")) {
            printWriter.printf("Information about your purchase:%n%s", basket);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
