package com.company.internetShop.model;

import java.util.Comparator;

public class ProductRatingComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result = o1.getRating() - o2.getRating();
        if (result != 0) {
            return result;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
