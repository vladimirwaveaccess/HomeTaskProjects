package com.company.internetShop.model;

import com.company.internetShop.common.ConnectorDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.SortedSet;
import java.util.TreeSet;

public class CategoryDAO {
    private static final String SQL_SELECT_ALL_CATEGORIES = "SELECT * FROM category";

    public SortedSet<Category> findAll() {
        SortedSet<Category> categories = new TreeSet<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_CATEGORIES);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                categories.add(new Category(id, name));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return categories;
    }
}
