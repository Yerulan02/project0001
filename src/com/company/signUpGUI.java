package com.company;

import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class signUpGUI extends Container {

    Connection connection;
    PreparedStatement preparedStatement;

    private JLabel nameWindow;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel genderLabel;
    private JLabel birthday;
    private JLabel numberLabel;
    private JLabel passLabel;
    private JLabel helpWordLabel;
    private JLabel errorLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private String[] gen = {"MAN", "WOMAN"};
    private JComboBox genderBox;
    private JComboBox days;
    private JComboBox month;
    private JComboBox year;
    private JTextField numberText;
    private JTextField passText;
    private JTextField helpWordText;

    private int adminTF;
    private JCheckBox admin;
    private JButton create;
    private JButton back;

    public signUpGUI() {

        connection = Connect.contectDB();

        setSize(700, 700);
        setLayout(null);

        Font f = new Font("Algerian",Font.PLAIN,50);

        nameWindow = new JLabel("BURGER KHAN");
        nameWindow.setBounds(200,120,600,50);
        nameWindow.setFont(f);
        add(nameWindow);

        JLabel background;
        ImageIcon img = new ImageIcon("/Users/user/IdeaProjects/restaurantApp/re.png");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 700, 700);

        admin = new JCheckBox("ADMIN");
        admin.setBounds(490,270,70,20);
        admin.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(admin.isSelected()){
                    adminTF=1;
                }else{
                    adminTF=0;
                }
            }
        });
        add(admin);

        nameLabel = new JLabel("NAME");
        nameLabel.setForeground(Color.white);
        nameLabel.setBounds(140, 270, 80, 20);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(330, 270, 150, 20);
        add(nameText);

        surnameLabel = new JLabel("SURNAME");
        surnameLabel.setBounds(140, 310, 80, 20);
        surnameLabel.setForeground(Color.white);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(330, 310, 150, 20);
        add(surnameText);

        genderLabel = new JLabel(" GENDER ");
        genderLabel.setBounds(140, 350, 80, 20);
        genderLabel.setForeground(Color.white);
        add(genderLabel);

        genderBox = new JComboBox(gen);
        genderBox.setBounds(330, 350, 100, 20);
        add(genderBox);

        birthday = new JLabel("BIRTHDAY");
        birthday.setBounds(140, 390, 80, 20);
        birthday.setForeground(Color.white);
        add(birthday);

        days = new JComboBox();
        days.setBounds(330, 390, 50, 20);
        add(days);

        for (int i = 1; i <= 31; i++) {
            days.addItem(i);
        }

        month = new JComboBox();
        month.setBounds(410, 390, 50, 20);
        add(month);

        for (int i = 1; i <= 12; i++) {
            month.addItem(i);
        }

        year = new JComboBox();
        year.setBounds(490, 390, 70, 20);
        add(year);

        for (int i = 1990; i <= 2020; i++) {
            year.addItem(i);
        }

        numberLabel = new JLabel("NUMBER");
        numberLabel.setBounds(140, 430, 80, 20);
        numberLabel.setForeground(Color.white);
        add(numberLabel);

        numberText = new JTextField();
        numberText.setBounds(330, 430, 150, 20);
        add(numberText);

        passLabel = new JLabel("PASSWORD");
        passLabel.setBounds(140, 470, 80, 20);
        passLabel.setForeground(Color.white);
        add(passLabel);

        passText = new JTextField();
        passText.setBounds(330, 470, 150, 20);
        add(passText);

        helpWordLabel = new JLabel("YOUR FAVOURITE MEAL NAME ");
        helpWordLabel.setBounds(140, 510, 200, 20);
        helpWordLabel.setForeground(Color.white);
        add(helpWordLabel);

        helpWordText = new JTextField();
        helpWordText.setBounds(330, 510, 150, 20);
        add(helpWordText);

        errorLabel = new JLabel("ERROR 222 FILL ALL COLUMNS");
        errorLabel.setBounds(250, 600, 200, 20);
        errorLabel.setForeground(Color.red);

        create = new JButton("CREATE");
        create.setBounds(300, 550, 200, 20);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(nameText.getText()==""||surnameText.getText()==""||(String) genderBox.getSelectedItem()==""||numberText.getText()==""||passText.getText()==""||helpWordText.getText()==""){
                        JOptionPane.showMessageDialog(null, "Fill all rows");
                        Client.frame.signUpGUI.setVisible(false);
                        Client.frame.signUpGUI.setVisible(true);
                    }else{
                        String date = "";
                        date += year.getSelectedItem() + "-";
                        date += month.getSelectedItem() + "-";
                        date += days.getSelectedItem();
                        String s = "Your favourite food name";
                        User user = new User(null, nameText.getText(), surnameText.getText(), (String) genderBox.getSelectedItem(), date, numberText.getText(), passText.getText(), s, helpWordText.getText(),adminTF);
                        PackageData pd = new PackageData("sign_up", user);
                        Client.connect(pd);
                        JOptionPane.showMessageDialog(null, "New account created");
                        Client.frame.signUpGUI.setVisible(false);
                        Client.frame.signUpGUI.setVisible(true);
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        add(create);

        back = new JButton("BACK");
        back.setBounds(450, 600, 100, 20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameText.setText("");
                surnameText.setText("");
                numberText.setText("");
                passText.setText("");
                helpWordText.setText("");
                Client.frame.signUpGUI.setVisible(false);
                Client.frame.mainmenu.setVisible(true);
            }
        });
        add(back);
        add(background);
    }
}

