package com.company.internetShop.model;

import com.company.internetShop.common.ConnectorDB;

import java.sql.*;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductDAO {
    private static final String SQL_SELECT_ALL_PRODUCTS = "SELECT * FROM product";
    private static final String SQL_SELECT_CATEGORY_PRODUCTS =
            "SELECT id, productname \n" +
            "FROM product \n" +
            "JOIN category_product ON product.id=category_product.product_id\n" +
            "WHERE category_product.category_id=?";

    public SortedSet<Product> findAll() {
        SortedSet<Product> products = new TreeSet<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_PRODUCTS);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double price = rs.getDouble(3);
                int rating = rs.getInt(4);
                products.add(new Product(id, name, price, rating));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return products;
    }

    public SortedSet<Product> findAllCategoryProducts(Integer categoryId) {
        SortedSet<Product> products = new TreeSet<>();
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_CATEGORY_PRODUCTS)) {
            statement.setInt(1, categoryId);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                products.add(new Product(id, name));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return products;
    }
}
