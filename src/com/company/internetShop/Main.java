package com.company.internetShop;

import com.company.internetShop.common.*;
import com.company.internetShop.businessLogic.*;
import com.company.internetShop.model.Basket;
import com.company.internetShop.model.User;

/**
 * Программа магазин.
 * Хардкорно прописываются данные типа каталоги категорий, продуктов.
 * После запуска программа просит авторизоваться пользователя (логин и пароль), данные произвольные.
 * Затем в цикле while происходит постоянный запрос пользователя о выборе пункта меню.
 * Программа продолжает работать до тех пор пока пользователь не выберет елемент меню EXIT
 */
public class Main {
    public static void main(String[] args) {

        Basket basketUser = new Basket();

        User user = LoginUser.authorization();

        boolean exit = true;
        while (exit) {
            ScannerUtility.clscr();
            OutputMenuElement.outputMenu();
            System.out.println();
            System.out.print(Constants.NUMBER_MENU);
            switch (OutputMenuElement.getMenuElement(ScannerUtility.getIntegerValue())) {
                case CATEGORY_LIST:
                    ScannerUtility.clscr();
                    OutputMenuElement.outputCategoriesList();
                    ScannerUtility.continueWork();
                    break;
                case GOODS_LIST_OF_CATEGORY:
                    ScannerUtility.clscr();
                    GoodsListOfCategory.getCategoryNumber();
                    ScannerUtility.continueWork();
                    break;
                case ALL_GOODS_LIST:
                    ScannerUtility.clscr();
                    AllGoods.AllGoodsOutput();
                    ScannerUtility.continueWork();
                    break;
                case ADD_TO_CART:
                    ScannerUtility.clscr();
                    basketUser.setProducts(AddToCart.getProductNumber());
                    basketUser.setPurchaseDate(AddToCart.getTime());
                    ScannerUtility.clscr();
                    System.out.println(Constants.BASKET_CONTAINS);
                    System.out.println(basketUser.toString());
                    ScannerUtility.continueWork();
                    break;
                case BUY_GOODS:
                    ScannerUtility.clscr();
                    BuyGoods.buyGoods(user, basketUser);
                    ScannerUtility.continueWork();
                    break;
                case EXIT:
                    ScannerUtility.clscr();
                    System.out.println(Constants.GOOD_BUY);
                    exit = false;
                    break;
                default:
                    ScannerUtility.clscr();
                    System.out.println(Constants.WRONG_NUMBER);
            }
        }
    }
}
