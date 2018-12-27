package com.company.internetShop.sourceCode;

import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceClass.Category;

import java.util.Scanner;

public class GoodsListOfCategory {
    /**
     * Метод выводящий на экран товары из выбранной пользователем категории
     *
     * @param categories - список категорий
     * @param scanner    - переменная для считывания введенных данных пользователем
     */
    public static void getCategoryNumber(Category[] categories, Scanner scanner) {
        OutputMenuElement.outputCategoriesList();
        System.out.print("Input number of category >");
        OutputMenuElement.outputGoodsOfCategory(categories, Input.getIntegerValue(scanner));
    }
}
