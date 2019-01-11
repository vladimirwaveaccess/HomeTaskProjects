package com.company.internetShop.common;

import com.company.internetShop.model.Category;
import com.company.internetShop.model.Product;

public class OutputMenuElement {
    /**
     * Output main menu
     */
    public static void outputMenu() {
        Menu[] menus = Menu.values();

        for (Menu menu : menus) {
            System.out.println(menu.getMenuElement() + " " + menu);
        }
    }

    /**
     * Output list of categories
     */
    public static void outputCategoriesList() {
        CategoryList[] categoryLists = CategoryList.values();
        for (CategoryList categoryList : categoryLists) {
            System.out.println(categoryList.getCategoryNumber() + " " + categoryList);
        }
    }

    /**
     * Output list of goods from category which is selected
     *
     * @param categories     - list of categories
     * @param numberCategory - number of category
     */
    public static void outputGoodsOfCategory(Category[] categories, int numberCategory) {
        ScannerUtility.clscr();
        for (Category category : categories) {
            if (category.getName().getCategoryNumber() == numberCategory) {
                System.out.println(category.toString());
            }
        }
    }

    /**
     * Output all goods
     *
     * @param products - list of all goods
     */
    public static void outputAllGoods(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ") " + products[i].getName());
        }
    }

    /**
     * Menu number transfer to name of menu
     *
     * @param numberMenu - menu number which input user
     * @return - menu name
     */
    public static Menu getMenuElement(int numberMenu) {
        Menu nameOfMenu = Menu.CATEGORY_LIST;
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if (menu.getMenuElement() == numberMenu) {
                nameOfMenu = menu;
            }
        }
        return nameOfMenu;
    }
}
