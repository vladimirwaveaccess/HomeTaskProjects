package com.company.internetShop.businessLogic;

import com.company.internetShop.common.Constants;
import com.company.internetShop.common.OutputMenuElement;
import com.company.internetShop.common.ScannerUtility;
import com.company.internetShop.model.Product;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class AddToCart {
    /**
     * Метод выводит список всех имеющихся товаров на экран и добавляет товары в корзину выбранные пользователем
     * до тех пор пока пользователь не выйдет из режима добавления товаров
     *
     * @param products - массив имеющихся продуктов
     * @return - возвращает коллекцию добавленных товаров
     */
    public static Set<Product> getProductNumber(Product[] products) {
        Set<Product> userBasket = new TreeSet<Product>();
        int select;
        do {
            ScannerUtility.clscr();
            OutputMenuElement.outputAllGoods(products);
            System.out.print("\n" + Constants.NUMBER_PRODUCT);
            userBasket.add(products[ScannerUtility.getIntegerValue() - 1]);
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
    public static LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
