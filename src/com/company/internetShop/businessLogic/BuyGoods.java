package com.company.internetShop.businessLogic;

import com.company.internetShop.common.Constants;
import com.company.internetShop.model.Basket;
import com.company.internetShop.model.BasketDAO;
import com.company.internetShop.model.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

public class BuyGoods {
    /**
     * Метод осуществляющий процедуру покупки
     *
     * @param user   - данные пользователя
     * @param basket - корзина с продуктами которые выбрад пользователь
     */
    public static void buyGoods(User user, Basket basket) {
        BasketDAO basketDAO = new BasketDAO();
        if (basket.getProducts().isEmpty()) {
            System.out.println("Sorry, your basket is empty!!!");
        } else {
            System.out.println("Information about your purchase:");
            System.out.println(basket.toString());
            PrintBasketToFile.printToFile(basket);
            basketSerialize(basket);
            System.out.println("\nPurchase processing, please wait");
            try {
                basketDAO.insertBasketToDB(user, basket);
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            basket.getProducts().removeAll(basket.getProducts());
            if (basket.getProducts().isEmpty()) {
                System.out.println("\nYour purchase is successful.");
            } else {
                System.out.println(Constants.ERROR_MESSAGE);
            }
        }
    }

    private static void basketSerialize(Basket basket) {
        try (FileOutputStream fs = new FileOutputStream("src\\com\\company\\internetShop\\basket.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(basket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
