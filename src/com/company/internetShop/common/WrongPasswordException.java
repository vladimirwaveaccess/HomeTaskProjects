package com.company.internetShop.common;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{} " + super.toString();
    }
}
