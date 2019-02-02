package com.company.internetShop.common;

import com.company.internetShop.model.User;

import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * Класс для работы с пользователем
 */
public class CreateUsersDB {

    /**
     * Метод создаёт множество типа User
     *
     * @return - заполненное множество типа User
     */
    private static Set<User> fillUsersDB() {
        Set<User> users = new TreeSet<>();

        users.add(new User("login5", "password5"));
        users.add(new User("login4", "password4"));
        users.add(new User("login3", "password3"));
        users.add(new User("login2", "password2"));
        users.add(new User("login1", "password1"));

        return users;
    }


    /**
     * Метод заполняет отображение dbUsers
     *
     * @param dbUsers - отображение которое необходимо заполнить данными
     */
    public static void createUserDB(NavigableMap<String, User> dbUsers) {
        for (User user : fillUsersDB()) {
            dbUsers.put(user.getLogin(), user);
        }
    }
}
