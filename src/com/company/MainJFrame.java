package com.company;

import javax.swing.*;

public class MainJFrame extends JFrame {

    public static mainMenu mainmenu;
    public static MenuFood menuFood;
    public static signUpGUI signUpGUI;
    public static Forgot forgot;
    public static Administrator administrator;
    public static ListClients listClients;
    public static Ordered ordered;

    public MainJFrame(){
        setSize(700,700);
        setTitle("Burger_Khan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainmenu = new mainMenu();
        mainmenu.setLocation(0,0);
        add(mainmenu);

        menuFood = new MenuFood();
        menuFood.setLocation(0,0);
        menuFood.setVisible(false);
        add(menuFood);

        signUpGUI = new signUpGUI();
        signUpGUI.setLocation(0,0);
        signUpGUI.setVisible(false);
        add(signUpGUI);

        forgot = new Forgot();
        forgot.setLocation(0,0);
        forgot.setVisible(false);
        add(forgot);

        administrator = new Administrator();
        administrator.setLocation(0,0);
        administrator.setVisible(false);
        add(administrator);

        listClients = new ListClients();
        listClients.setLocation(0,0);
        listClients.setVisible(false);
        add(listClients);

        ordered = new Ordered();
        ordered.setLocation(0,0);
        ordered.setVisible(false);
        add(ordered);

    }
}
