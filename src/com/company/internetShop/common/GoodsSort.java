package com.company.internetShop.common;


public enum GoodsSort {
    NAME_SORT(1), PRICE_SORT(2), RATING_SORT(3);

    private int sortElement;

    GoodsSort(int sortElement) {
        this.sortElement = sortElement;
    }

    public int getSortElement() {
        return sortElement;
    }
}
