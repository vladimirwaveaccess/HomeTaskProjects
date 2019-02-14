package com.company.internetShop.businessLogic;

import com.company.internetShop.common.Constants;
import com.company.internetShop.common.OutputMenuElement;
import com.company.internetShop.common.ScannerUtility;
import com.company.internetShop.model.Product;

import java.util.*;

public class AddToCart {
    /**
     * Метод выводит список всех имеющихся товаров на экран и добавляет товары в корзину выбранные пользователем
     * до тех пор пока пользователь не выйдет из режима добавления товаров
     *
     * @return - возвращает коллекцию добавленных товаров
     */
    public static SortedSet<Product> getProductNumber() {
        SortedSet<Product> userBasket = new TreeSet<>();
        Map<Integer, Product> productsMap;
        int select;
        do {
            ScannerUtility.clscr();
            productsMap = OutputMenuElement.outputAllGoods();
            System.out.print("\n" + Constants.NUMBER_PRODUCT);
            userBasket.add(productsMap.get(ScannerUtility.getIntegerValue()));
            System.out.print("\n" + Constants.BACK_TO_MAIN_MENU);
            select = ScannerUtility.getIntegerValue();
        } while (select != -1);
        return userBasket;
    }

    /**
     * Метод возвращает текущее время
     *
     * @return - текущее время
     */
    public static java.sql.Date getTime() {
        return new java.sql.Date(Calendar.getInstance().getTimeInMillis());
    }
}
