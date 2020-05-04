package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class mainMenu extends Container {

   private JLabel numberLabel;
   private JLabel passwordLabel;

   private JTextField numberText;
   private JPasswordField passwordText;

    private JButton login;
    private JButton singUp;
    private JButton forgot;

   public mainMenu(){
       setSize(700,700);
       setLayout(null);

       JLabel background;
       ImageIcon img = new ImageIcon("/Users/user/IdeaProjects/restaurantApp/burger.jpg");
       background = new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,700,700);

       numberLabel = new JLabel("NUMBER");
       numberLabel.setBounds(100,100,100,30);
       numberLabel.setForeground(Color.white);
       add(numberLabel);

       passwordLabel = new JLabel("PASSWORD");
       passwordLabel.setBounds(100,150,100,30);
       passwordLabel.setForeground(Color.white);
       add(passwordLabel);

        numberText = new JTextField();
        numberText.setBounds(250,100,150,20);
        add(numberText);

        passwordText = new JPasswordField();
        passwordText.setBounds(250,150,150,20);
        add(passwordText);

        forgot = new JButton("FORGOT");
        forgot.setBounds(180,260,100,20);
        forgot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client.frame.mainmenu.setVisible(false);
                Client.frame.forgot.setVisible(true);
            }
        });
       add(forgot);

        login = new JButton("LOG IN");
        login.setBounds(100,200,100,20);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<User> users = Client.getUsers();
                if (!numberText.getText().equals("") && !passwordText.getText().equals("")) {
                    try {
                        boolean found = false;
                        for (User u : users) {

                            if (u.getNumber().equals(numberText.getText()) && u.getPassword().equals(passwordText.getText()) && u.getAdmin()==0) {
                                Client.ad.add(0,0);
                                Client.frame.mainmenu.setVisible(false);
                                Client.frame.menuFood.setVisible(true);
                                found = true;
                            }else if(u.getNumber().equals(numberText.getText()) && u.getPassword().equals(passwordText.getText()) && u.getAdmin()==1){
                                Client.ad.add(0,1);
                                Client.frame.mainmenu.setVisible(false);
                                Client.frame.administrator.setVisible(true);
                                found = true;
                            }
                        }
                        if (found) {
                            numberText.setText("");
                            passwordText.setText("");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        add(login);

        singUp = new JButton("SIGN UP");
        singUp.setBounds(250,200,100,20);
        singUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client.frame.mainmenu.setVisible(false);
                Client.frame.signUpGUI.setVisible(true);
            }
        });
        add(singUp);
       add(background);
   }


}
