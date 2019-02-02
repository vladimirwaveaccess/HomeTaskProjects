package com.company.internetShop.model;

import javax.swing.*;

public class AuthorisationWindow extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    private JLabel labelLogin = new JLabel("Login ");
    private JTextField inputLogin = new JTextField(40);
    private JLabel labelPassword = new JLabel("Password");
    private JPasswordField inputPassword = new JPasswordField(40);
    private JLabel labelConPassword = new JLabel("Confirm password");
    private JPasswordField inputConPassword = new JPasswordField(40);

    public AuthorisationWindow() {
        super("AuthorisationWindow");
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
