package com.company.internetShop.model;

import com.company.internetShop.common.ConnectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BasketDAO {
    private static final String SQL_INSERT_USER = "INSERT INTO history (user_id, create_date, product_id) VALUES (?,?,?)";

    public void insertBasketToDB(User user, Basket basket) {
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(SQL_INSERT_USER)) {
            for (Product product : basket.getProducts()) {
                statement.setInt(1, user.getId());
                statement.setDate(2, basket.getPurchaseDate());
                statement.setInt(3, product.getId());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
    }
}
