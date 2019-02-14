package com.company.internetShop.common;

import com.company.internetShop.model.Category;
import com.company.internetShop.model.CategoryDAO;
import com.company.internetShop.model.Product;
import com.company.internetShop.model.ProductDAO;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;

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
     * Output sort menu for goods
     */
    public static void outputSortMenu() {
        GoodsSort[] goodsSorts = GoodsSort.values();

        for (GoodsSort goodsSort : goodsSorts) {
            System.out.println(goodsSort.getSortElement() + " " + goodsSort);
        }
    }

    /**
     * Output list of categories
     */
    public static void outputCategoriesList() {
        CategoryDAO categoryDAO = new CategoryDAO();
        SortedSet<Category> categories = categoryDAO.findAll();
        for (Category category : categories) {
            System.out.printf("%-4d%s%n", category.getId(), category.getName());
        }
    }

    /**
     * Output list of goods from category which is selected
     *
     * @param numberCategory - number of category
     */
    public static void outputGoodsOfCategory(int numberCategory) {
        ScannerUtility.clscr();
        ProductDAO productDAO = new ProductDAO();
        for (Product product : productDAO.findAllCategoryProducts(numberCategory)) {
            System.out.printf("%-4d%s%n", product.getId(), product.getName());
        }
    }

    /**
     * Output all goods
     *
     * @return - map of products
     */
    public static Map<Integer, Product> outputAllGoods() {
        Map<Integer, Product> productMap = new TreeMap<>();
        ProductDAO productDAO = new ProductDAO();
        for (Product product : productDAO.findAll()) {
            productMap.put(product.getId(), product);
            System.out.printf("%-6d%s%n", product.getId(), product.getName());
        }
        return productMap;
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

    /**
     * Sort menu number transfer to name of sort menu
     *
     * @param numberMenu - menu number which input user
     * @return - menu name
     */
    public static GoodsSort getSortMenuElement(int numberMenu) {
        GoodsSort nameOfMenu = GoodsSort.NAME_SORT;
        GoodsSort[] goodsSorts = GoodsSort.values();
        for (GoodsSort goodsSort : goodsSorts) {
            if (goodsSort.getSortElement() == numberMenu) {
                nameOfMenu = goodsSort;
            }
        }
        return nameOfMenu;
    }
}
