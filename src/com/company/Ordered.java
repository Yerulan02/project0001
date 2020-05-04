package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ordered extends Container {

    private JTextArea textArea;
    private JTextArea jTextArea;
    private JButton back;
    private JButton check;

    public Ordered(){

        setSize(700,700);
        setLayout(null);
        JLabel background;
        ImageIcon img = new ImageIcon("/Users/user/IdeaProjects/restaurantApp/ordered.png");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 500, 700);

        jTextArea = new JTextArea();
        jTextArea.setBounds(500,0,200,100);
        jTextArea.setFont(new Font("Algerian",1,40));
        add(jTextArea);

        textArea = new JTextArea();
        textArea.setBounds(500,100,200,400);
        add(textArea);

        check = new JButton("CHECK");
        check.setBounds(350,580,120,20);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = '\n'+ "  CHECK";
                jTextArea.setText(q);
                String s= Client.frame.menuFood.getData();
                textArea.setText(s);
            }
        });
        add(check);

        back = new JButton("BACK");
        back.setBounds(550,580,120,20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Client.ad.get(0)==1){
                        Client.frame.ordered.setVisible(false);
                        Client.frame.administrator.setVisible(true);
                    }else{
                        Client.frame.ordered.setVisible(false);
                        Client.frame.menuFood.setVisible(true);
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        add(back);
        add(background);
    }
}
