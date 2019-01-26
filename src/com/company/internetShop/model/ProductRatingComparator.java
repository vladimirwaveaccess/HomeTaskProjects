package com.company.internetShop.model;

import java.util.Comparator;

public class ProductRatingComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getRating() - o2.getRating();
    }
}
