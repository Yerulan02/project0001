package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Administrator extends Container {

    private JButton menuButton;
    private JButton listClients;
    private JButton back;
    public Administrator() {
        setSize(700, 700);
        setLayout(null);

        JLabel background;
        ImageIcon img = new ImageIcon("/Users/user/IdeaProjects/restaurantApp/of.png");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 700, 700);

        menuButton = new JButton("MENU");
        menuButton.setBounds(150, 170, 250, 30);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client.frame.administrator.setVisible(false);
                Client.frame.menuFood.setVisible(true);
            }
        });
        add(menuButton);

            listClients = new JButton("WORK WITH CLIENTS");
        listClients.setBounds(150,220,250,30);
        listClients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client.frame.administrator.setVisible(false);
                Client.frame.listClients.setVisible(true);
            }
        });
        add(listClients);

        back = new JButton("BACK");
        back.setBounds(150,270,250,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Client.frame.administrator.setVisible(false);
                Client.frame.mainmenu.setVisible(true);
            }
        });
        add(back);
        add(background);
    }

}
