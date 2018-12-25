package com.company.internetShop.common;

public enum CategoryList {
    CHEMISTRY(1), MOBILE_DEVICE(2), DEVICE_FOR_LAPTOP(3);

    private int categoryNumber;

    CategoryList(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }
}
