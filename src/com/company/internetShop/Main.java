package com.company.internetShop;

import com.company.internetShop.common.CategoryList;
import com.company.internetShop.common.Constants;
import com.company.internetShop.common.OutputMenuElement;
import com.company.internetShop.common.ScannerUtility;
import com.company.internetShop.businessLogic.*;
import com.company.internetShop.model.Basket;
import com.company.internetShop.model.Category;
import com.company.internetShop.model.Product;
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

        Category[] categories = new Category[CategoryList.values().length];

        Product[] products = new Product[]{
                new Product("productChemistry1", 234, 5), new Product("productChemistry2", 111, 4),
                new Product("productMobileDevice1", 10555, 4), new Product("productMobileDevice2", 12222, 5),
                new Product("productsDeviceForLaptop1", 561, 3), new Product("productsDeviceForLaptop2", 1212, 4)
        };
        Product[] productsChemistry = new Product[]{products[0], products[1]};
        Product[] productsMobileDevice = new Product[]{products[2], products[3]};
        Product[] productsDeviceForLaptop = new Product[]{products[4], products[5]};

        Basket basketUser = new Basket();

        categories[0] = new Category(CategoryList.CHEMISTRY, productsChemistry);
        categories[1] = new Category(CategoryList.MOBILE_DEVICE, productsMobileDevice);
        categories[2] = new Category(CategoryList.DEVICE_FOR_LAPTOP, productsDeviceForLaptop);


        // User authorization
        User user1 = LoginUser.getUserCredentials();

        // Main loop
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
                    ScannerUtility.ContinueWork();
                    break;
                case GOODS_LIST_OF_CATEGORY:
                    ScannerUtility.clscr();
                    GoodsListOfCategory.getCategoryNumber(categories);
                    ScannerUtility.ContinueWork();
                    break;
                case ADD_TO_CART:
                    ScannerUtility.clscr();
                    basketUser.setProducts(AddToCart.getProductNumber(products));
                    basketUser.setPurchaseDate(AddToCart.getTime());
                    ScannerUtility.clscr();
                    System.out.println(Constants.BASKET_CONTAINS);
                    System.out.println(basketUser.toString());
                    ScannerUtility.ContinueWork();
                    break;
                case BUY_GOODS:
                    ScannerUtility.clscr();
                    BuyGoods.buyGoods(user1, basketUser);
                    ScannerUtility.ContinueWork();
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
