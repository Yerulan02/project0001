package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListClients<data> extends Container {

    private DefaultTableModel model;
    private JTable table;
    private JButton back;
    private Object[] columns={"#Id","Name", "Surname", "Number","Password"};
    private JTextField text;
    private JButton delete;

    public ListClients(){
    setSize(700,700);
    setLayout(null);

    ArrayList<User> users = Client.getUsers();
    String[][] data = new String[9999][5];
        for (int i = 0; i < users.size() ; i++) {
            data[i][0] = String.valueOf(users.get(i).getId());
            data[i][1] = users.get(i).getName();
            data[i][2] = users.get(i).getSurname();
            data[i][3] = users.get(i).getNumber();
            data[i][4] = users.get(i).getPassword();
        }
        table = new JTable();
        model=new DefaultTableModel();
        model.setDataVector(data,columns);
        table.setModel(model);
        table.setBackground(Color.lightGray);
        table.setForeground(Color.black);
        table.setFont(new Font("Arial", 1, 16));
        table.setRowHeight(30);
    JScrollPane pane = new JScrollPane(table);
    pane.setBounds(0,0,680,630);
    add(pane);

        text = new JTextField();
        text.setBounds(320,640,30,20);
        add(text);

        delete = new JButton("DELETE");
        delete.setBounds(100,640,200,20);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < users.size(); i++) {
                    if(String.valueOf(users.get(i).getId()).equalsIgnoreCase(text.getText())){
                        User u = users.get(i);
                        PackageData pd = new PackageData("delete_user", u);
                        pd.setUser(u);
                        Client.connect(pd);
                        users.remove(i);
                        model.removeRow(i);
                    }
                }
            }
        });
        add(delete);

        back = new JButton("BACK");
        back.setBounds(450,640,100,20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        Client.frame.listClients.setVisible(false);
                        Client.frame.administrator.setVisible(true);
            }
        });
        add(back);

    }
}


