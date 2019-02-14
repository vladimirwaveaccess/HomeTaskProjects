package com.company.internetShop.businessLogic;

import com.company.internetShop.common.Constants;
import com.company.internetShop.common.OutputMenuElement;
import com.company.internetShop.common.ScannerUtility;
import com.company.internetShop.model.Product;
import com.company.internetShop.model.ProductDAO;
import com.company.internetShop.model.ProductPriceComparator;
import com.company.internetShop.model.ProductRatingComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class AllGoods {
    public static void AllGoodsOutput() {
        OutputMenuElement.outputSortMenu();
        System.out.println();
        System.out.print(Constants.NUMBER_SORT_MENU);
        switch (OutputMenuElement.getSortMenuElement(ScannerUtility.getIntegerValue())) {
            case NAME_SORT:
                ScannerUtility.clscr();
                OutputMenuElement.outputAllGoods();
                break;
            case PRICE_SORT:
                ScannerUtility.clscr();
                outputGoodsSortByPrice();
                break;
            case RATING_SORT:
                ScannerUtility.clscr();
                outputGoodsSortByRating();
                break;
            default:
                ScannerUtility.clscr();
                System.out.println(Constants.WRONG_NUMBER);
        }
    }

    private static void outputGoodsSortByPrice() {
        ProductDAO productDAO = new ProductDAO();
        ProductPriceComparator productComparator = new ProductPriceComparator();
        SortedSet<Product> products = new TreeSet<>(productComparator);
        products.addAll(productDAO.findAll());
        for (Product product : products) {
            System.out.printf("%-6d%-30s%f%n", product.getId(), product.getName(), product.getPrice());
        }
    }

    private static void outputGoodsSortByRating() {
        ProductDAO productDAO = new ProductDAO();
        ProductRatingComparator productComparator = new ProductRatingComparator();
        SortedSet<Product> products = new TreeSet<>(productComparator);
        products.addAll(productDAO.findAll());
        for (Product product : products) {
            System.out.printf("%-6d%-30s%d%n", product.getId(), product.getName(), product.getRating());
        }
    }

}
