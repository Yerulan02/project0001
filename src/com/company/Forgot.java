package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Forgot extends Container {

    private JLabel numberLabel;
    private JLabel passLabel;
    private JLabel helpWordLabel;

    private JTextField numberText;
    private JTextField passText;
    private JTextField helpWordText;

    private JButton search;
    private JButton back;

    public Forgot(){

        setSize(700,700);
        setLayout(null);

        JLabel background2;
        ImageIcon imga = new ImageIcon("/Users/user/IdeaProjects/restaurantApp/password.png");
        background2 = new JLabel("",imga,JLabel.CENTER);
        background2.setBounds(0,0,700,700);

        numberLabel = new JLabel("NUMBER");
        numberLabel.setBounds(80,150,100,20);
        numberLabel.setForeground(Color.white);
        add(numberLabel);

        helpWordLabel = new JLabel("YOUR FAVOURITE MEAL NAME");
        helpWordLabel.setBounds(80,190,200,20);
        helpWordLabel.setForeground(Color.white);
        add(helpWordLabel);

        passLabel = new JLabel("PASSWORD");
        passLabel.setBounds(80,270,100,20);
        passLabel.setForeground(Color.white);
        add(passLabel);

        numberText = new JTextField();
        numberText.setBounds(200,150,100,20);
        add(numberText);

        helpWordText = new JTextField();
        helpWordText.setBounds(200,230,100,20);
        add(helpWordText);

        passText = new JTextField();
        passText.setBounds(200,270,100,20);
        add(passText);

        search = new JButton("FIND");
        search.setBounds(320,150,110,20);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ArrayList<User> users = Client.getUsers();
                    int t=0;
                    for (int i=0;i<users.size();i++){
                        if (users.get(i).getNumber().equalsIgnoreCase(numberText.getText())&&users.get(i).getAnswer().equalsIgnoreCase(helpWordText.getText())){
                            JOptionPane.showMessageDialog(null,"It is number true");
                            passText.setText(users.get(i).getPassword());
                        }else {
                            t++;
                        }
                    }
                    if(t==users.size()){
                        System.out.println(users.size());
                        JOptionPane.showMessageDialog(null, "Incorrect number or helpword");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        add(search);

        back = new JButton("BACK");
        back.setBounds(570, 620, 100, 20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client.frame.forgot.setVisible(false);
                Client.frame.mainmenu.setVisible(true);
            }
        });
        add(back);
        add(background2);
    }

}
