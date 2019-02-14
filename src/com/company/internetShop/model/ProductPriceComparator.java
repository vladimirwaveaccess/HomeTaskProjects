package com.company.internetShop.model;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result = Double.compare(o1.getPrice(), o2.getPrice());
        if (result != 0) {
            return result;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
