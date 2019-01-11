package com.company.internetShop.businessLogic;

import com.company.internetShop.common.Constants;
import com.company.internetShop.common.OutputMenuElement;
import com.company.internetShop.common.ScannerUtility;
import com.company.internetShop.model.Category;

public class GoodsListOfCategory {
    /**
     * Метод выводящий на экран товары из выбранной пользователем категории
     *
     * @param categories - список категорий
     */
    public static void getCategoryNumber(Category[] categories) {
        OutputMenuElement.outputCategoriesList();
        System.out.print("\n" + Constants.NUMBER_CATEGORY);
        OutputMenuElement.outputGoodsOfCategory(categories, ScannerUtility.getIntegerValue());
    }
}
