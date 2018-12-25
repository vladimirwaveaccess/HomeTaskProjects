package com.company.internetShop;

import com.company.internetShop.common.CategoryList;
import com.company.internetShop.methods.Input;
import com.company.internetShop.sourceCode.*;
import com.company.internetShop.sourceClass.Basket;
import com.company.internetShop.sourceClass.Category;
import com.company.internetShop.sourceClass.Product;
import com.company.internetShop.sourceClass.User;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Создать несколько объектов класса Категория.
 * Создать объект класса User.
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
        Set<Product> userBasket = new HashSet<Product>();
        userBasket.add(products[1]);
        userBasket.add(products[4]);
        Basket basketUser1 = new Basket(userBasket);

        categories[0] = new Category(CategoryList.CHEMISTRY, productsChemistry);
        categories[1] = new Category(CategoryList.MOBILE_DEVICE, productsMobileDevice);
        categories[2] = new Category(CategoryList.DEVICE_FOR_LAPTOP, productsDeviceForLaptop);


        /*
         *  User authorization
         */
        User user1 = LoginUser.getUserCredentials();
//        System.out.println(user1.toString());
        Input.clscr();
        OutputMenuElement.outputMenu();
        System.out.println();
        System.out.print("Input number of item menu >");

        switch (OutputMenuElement.getMenuElement(Input.getIntegerValue(scanner))) {
            case CATEGORY_LIST:
                Input.clscr();
                OutputMenuElement.outputCategoriesList();
                break;
            case GOODS_LIST_OF_CATEGORY:
                Input.clscr();
                GoodsListOfCategory.getCategoryNumber(categories, scanner);
                break;
            case ADD_TO_CART:
                Input.clscr();
                basketUser.setProducts(AddToCart.getProductNumber(products, scanner));
                Input.clscr();
                System.out.println("Your basket contains >\n");
                System.out.println(basketUser.toString());
                break;
            case BUY_GOODS:
                Input.clscr();
                BuyGoods.buyGoods(user1, basketUser1);
                break;
            default:
                System.out.println("You are selected wrong number");
        }
    }
}
