package com.company.internetShop.common;

/**
 * Список элементов главного меню
 */
public enum Menu {
    CATEGORY_LIST(1), GOODS_LIST_OF_CATEGORY(2), ALL_GOODS_LIST(3), ADD_TO_CART(4), BUY_GOODS(5), EXIT(6);

    private int menuElement;

    Menu(int menuElement) { // constructor
        this.menuElement = menuElement;
    }

    public int getMenuElement() {
        return menuElement;
    }
}
