package com.company.internetShop;

import com.company.internetShop.common.CategoryList;
import com.company.internetShop.common.Constants;
import com.company.internetShop.methods.Input;
import com.company.internetShop.methods.Methods;
import com.company.internetShop.sourceCode.*;
import com.company.internetShop.sourceClass.Basket;
import com.company.internetShop.sourceClass.Category;
import com.company.internetShop.sourceClass.Product;
import com.company.internetShop.sourceClass.User;

import java.util.Scanner;

/**
 * Программа магазин.
 * Хардкорно прописываюися данные типа каталоги категорий, продуктов.
 * После запуска программа просит авторизоваться пользователя (логин и пароль), данные произвольные.
 * Затем в цикле while происходит постоянный запрос пользователя о выбре пункта меню.
 * Программа продолжает работать до тех пор пока пользователь не выберет елемент меню EXIT
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
            Input.clscr();
            OutputMenuElement.outputMenu();
            System.out.println();
            System.out.print("Input number of item menu >");
            switch (OutputMenuElement.getMenuElement(Input.getIntegerValue(scanner))) {
                case CATEGORY_LIST:
                    Input.clscr();
                    OutputMenuElement.outputCategoriesList();
                    Methods.ContinueWork();
                    break;
                case GOODS_LIST_OF_CATEGORY:
                    Input.clscr();
                    GoodsListOfCategory.getCategoryNumber(categories, scanner);
                    Methods.ContinueWork();
                    break;
                case ADD_TO_CART:
                    Input.clscr();
                    basketUser.setProducts(AddToCart.getProductNumber(products, scanner));
                    Input.clscr();
                    System.out.println("Your basket contains >\n");
                    System.out.println(basketUser.toString());
                    Methods.ContinueWork();
                    break;
                case BUY_GOODS:
                    Input.clscr();
                    BuyGoods.buyGoods(user1, basketUser);
                    Methods.ContinueWork();
                    break;
                case EXIT:
                    Input.clscr();
                    System.out.println(Constants.GOOD_BUY);
                    exit = false;
                    break;
                default:
                    Input.clscr();
                    System.out.println("You are selected wrong number");
            }
        }
    }
}
