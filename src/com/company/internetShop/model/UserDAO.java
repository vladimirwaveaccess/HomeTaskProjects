package com.company.internetShop.model;

import com.company.internetShop.common.ConnectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private static final String SQL_SELECT_USER_LOGIN = "SELECT * FROM users WHERE user_login=?";
    private static final String SQL_INSERT_USER = "INSERT INTO users (user_login, user_password) VALUES (?,?)";

    public User findEntityByLogin(String login) {
        User user = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(SQL_SELECT_USER_LOGIN)) {
            statement.setString(1, login);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                String user_login = rs.getString(2);
                String user_password = rs.getString(3);
                user = new User(id, user_login, user_password);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return user;
    }

    public void insertUserToDB(String login, String password) {
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(SQL_INSERT_USER)) {
            statement.setString(1, login);
            statement.setString(2, password);
            statement.addBatch();
            statement.executeBatch();
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
    }
}
