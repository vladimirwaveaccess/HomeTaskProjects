package com.company.internetShop.businessLogic;

import com.company.internetShop.common.Constants;
import com.company.internetShop.common.OutputMenuElement;
import com.company.internetShop.common.ScannerUtility;


public class GoodsListOfCategory {
    /**
     * Метод выводящий на экран товары из выбранной пользователем категории
     */
    public static void getCategoryNumber() {
        OutputMenuElement.outputCategoriesList();
        System.out.print("\n" + Constants.NUMBER_CATEGORY);
        OutputMenuElement.outputGoodsOfCategory(ScannerUtility.getIntegerValue());
    }
}
