package com.company.internetShop.sourceCode;

import com.company.internetShop.common.Constants;
import com.company.internetShop.sourceClass.Basket;
import com.company.internetShop.sourceClass.User;

import java.util.concurrent.TimeUnit;

public class BuyGoods {
    /**
     * Метод осуществляющий процедуру покупки
     *
     * @param user   - данные пользователя
     * @param basket - корзина с продуктами которые выбрад пользователь
     */
    public static void buyGoods(User user, Basket basket) {
        if (basket.getProducts().isEmpty()) {
            System.out.println("Sorry, your basket is empty!!!");
        } else {
            user.setBasket(basket);
            System.out.println("Information about your purchase:");
            System.out.println(user.toString());
            System.out.println("Purchase processing, please wait");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            basket.getProducts().removeAll(basket.getProducts());
            if (basket.getProducts().isEmpty()) {
                System.out.println("Your purchase is successful.");
            } else {
                System.out.println(Constants.ERROR_MESSAGE);
            }
        }
    }
}
