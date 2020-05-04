package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public  class MenuFood extends Container {

    private JLabel nameWindow;
    private JLabel mealsLabel;
    private JLabel drinksLabel;
    private JLabel additiveLabel;

    private JLabel hamburgerLabel;
    private JLabel CheeseburgerLabel;
    private JLabel ChickenburgerLabel;
    private JLabel BigmackLabel;
    private JLabel FiletoFishLabel;

    private JLabel hamburgerPrice;
    private JLabel CheeseburgerPrice;
    private JLabel ChickenburgerPrice;
    private JLabel BigmackPrice;
    private JLabel FiletoFishPrice;

    private JLabel waterLabel;
    private JLabel CocaColaLabel;
    private JLabel FantaLabel;
    private JLabel SpriteLabel;
    private JComboBox juiceLabel;
    private String[] j = {"Orange juice","Apple juice"};

    private JLabel waterPrice;
    private JLabel CocaColaPrice;
    private JLabel FantaPrice;
    private JLabel SpritePrice;
    private JLabel juicePrice;

    private JTextField Jcount1;
    private JTextField Jcount2;
    private JTextField Jcount3;
    private JTextField Jcount4;
    private JTextField Jcount5;

    private JTextField Mcount1;
    private JTextField Mcount2;
    private JTextField Mcount3;
    private JTextField Mcount4;
    private JTextField Mcount5;

    private JLabel fries;
    private JComboBox sous;
    private String[] s = {"Ketchup" , "Mustard sauce" , "Cheese sauce"};

    private JTextField Fcount;
    private JTextField Scount;


    private JLabel friesPrice;
    private JLabel sousPrice;

    private JLabel CostOfMeals;
    private JLabel CostOfDrinks;
    private JLabel CostOfAdditive;
    private JLabel TotalCost;

    private JTextField CostOfMealsText;
    private JTextField CostOfDrinksText;
    private JTextField CostOfAdditiveText;
    private JTextField TotalCostText;

    private JButton order;
    private JButton calculate;
    private JButton clear;
    private JButton back;
    int total;

    public MenuFood(){
        setSize(700,700);
        setLayout(null);

        JLabel background;
        ImageIcon img = new ImageIcon("/Users/user/IdeaProjects/restaurantApp/fon.png");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 700, 700);

        Font f = new Font("Algerian",Font.PLAIN,50);
        Font f2 = new Font("Algerian",Font.PLAIN,20);

        nameWindow = new JLabel("BURGER KHAN");
        nameWindow.setBounds(180,30,400,50);
        nameWindow.setForeground(Color.yellow);
        nameWindow.setFont(f);
        add(nameWindow);


        mealsLabel = new JLabel("MEALS");
        mealsLabel.setBounds(100,100,110,40);
        mealsLabel.setForeground(Color.white);
        mealsLabel.setFont(f2);
        add(mealsLabel);

        drinksLabel = new JLabel("DRINKS (0,5L)");
        drinksLabel.setBounds(400,100,150,40);
        drinksLabel.setForeground(Color.white);
        drinksLabel.setFont(f2);
        add(drinksLabel);

        hamburgerLabel = new JLabel("Hamburger");
        hamburgerLabel.setBounds(40,160,100,20);
        hamburgerLabel.setForeground(Color.white);
        add(hamburgerLabel);

        hamburgerPrice = new JLabel("350T");
        hamburgerPrice.setBounds(160,160,50,20);
        hamburgerPrice.setForeground(Color.white);
        add(hamburgerPrice);

        Mcount1 = new JTextField("0");
        Mcount1.setBounds(220,160,50,20);
        add(Mcount1);

        CheeseburgerLabel = new JLabel("Cheeseburger");
        CheeseburgerLabel.setBounds(40,200,100,20);
        CheeseburgerLabel.setForeground(Color.white);
        add(CheeseburgerLabel);

        CheeseburgerPrice = new JLabel("350T");
        CheeseburgerPrice.setBounds(160,200,50,20);
        CheeseburgerPrice.setForeground(Color.white);
        add(CheeseburgerPrice);

        Mcount2 = new JTextField("0");
        Mcount2.setBounds(220,200,50,20);
        add(Mcount2);

        ChickenburgerLabel = new JLabel("Chickenburger");
        ChickenburgerLabel.setBounds(40,240,100,20);
        ChickenburgerLabel.setForeground(Color.white);
        add(ChickenburgerLabel);

        ChickenburgerPrice = new JLabel("350T");
        ChickenburgerPrice.setBounds(160,240,50,20);
        ChickenburgerPrice.setForeground(Color.white);
        add(ChickenburgerPrice);

        Mcount3 = new JTextField("0");
        Mcount3.setBounds(220,240,50,20);
        add(Mcount3);

        BigmackLabel = new JLabel("Bigmack");
        BigmackLabel.setBounds(40,280,100,20);
        BigmackLabel.setForeground(Color.white);
        add(BigmackLabel);

        BigmackPrice = new JLabel("900T");
        BigmackPrice.setBounds(160,280,50,20);
        BigmackPrice.setForeground(Color.white);
        add(BigmackPrice);

        Mcount4 = new JTextField("0");
        Mcount4.setBounds(220,280,50,20);
        add(Mcount4);

        FiletoFishLabel  = new JLabel("Filet-o-Fish");
        FiletoFishLabel.setBounds(40,320,100,20);
        FiletoFishLabel.setForeground(Color.white);
        add(FiletoFishLabel);

        FiletoFishPrice = new JLabel("850T");
        FiletoFishPrice.setBounds(160,320,50,20);
        FiletoFishPrice.setForeground(Color.white);
        add(FiletoFishPrice);

        Mcount5 = new JTextField("0");
        Mcount5.setBounds(220,320,50,20);
        add(Mcount5);

        additiveLabel = new JLabel("ADDITIVE");
        additiveLabel.setBounds(100,360,110,40);
        additiveLabel.setForeground(Color.white);
        additiveLabel.setFont(f2);
        add(additiveLabel);

        fries = new JLabel("FRIES");
        fries.setBounds(40,400,100,20);
        fries.setForeground(Color.white);
        add(fries);

        friesPrice = new JLabel("300T");
        friesPrice.setBounds(160,400,50,20);
        friesPrice.setForeground(Color.white);
        add(friesPrice);

        Fcount = new JTextField("0");
        Fcount.setBounds(220,400,50,20);
        add(Fcount);


        sous = new JComboBox(s);
        sous.setBounds(40,440,100,20);
        add(sous);

        sousPrice = new JLabel("100T");
        sousPrice.setBounds(160,440,50,20);
        sousPrice.setForeground(Color.white);
        add(sousPrice);

        Scount = new JTextField("0");
        Scount.setBounds(220,440,50,20);
        add(Scount);

        waterLabel = new JLabel("WATER");
        waterLabel.setBounds(340,160,100,20);
        waterLabel.setForeground(Color.white);
        add(waterLabel);

        waterPrice = new JLabel("250T");
        waterPrice.setBounds(460,160,50,20);
        waterPrice.setForeground(Color.white);
        add(waterPrice);

        Jcount1 = new JTextField("0");
        Jcount1.setBounds(520,160,50,20);
        add(Jcount1);

        CocaColaLabel = new JLabel("COCA COLA");
        CocaColaLabel.setBounds(340,200,100,20);
        CocaColaLabel.setForeground(Color.white);
        add(CocaColaLabel);

        CocaColaPrice = new JLabel("300T");
        CocaColaPrice.setBounds(460,200,50,20);
        CocaColaPrice.setForeground(Color.white);
        add(CocaColaPrice);

        Jcount2 = new JTextField("0");
        Jcount2.setBounds(520,200,50,20);
        add(Jcount2);

        FantaLabel = new JLabel("FANTA");
        FantaLabel.setBounds(340,240,100,20);
        FantaLabel.setForeground(Color.white);
        add(FantaLabel);

        FantaPrice = new JLabel("300T");
        FantaPrice.setBounds(460,240,50,20);
        FantaPrice.setForeground(Color.white);
        add(FantaPrice);

        Jcount3 = new JTextField("0");
        Jcount3.setBounds(520,240,50,20);
        add(Jcount3);

        SpriteLabel = new JLabel("SPRITE");
        SpriteLabel.setBounds(340,280,100,20);
        SpriteLabel.setForeground(Color.white);
        add(SpriteLabel);

        SpritePrice = new JLabel("300T");
        SpritePrice.setBounds(460,280,50,20);
        SpritePrice.setForeground(Color.white);
        add(SpritePrice);

        Jcount4 = new JTextField("0");
        Jcount4.setBounds(520,280,50,20);
        add(Jcount4);

        juiceLabel = new JComboBox(j);
        juiceLabel.setBounds(340,320,100,20);
        add(juiceLabel);

        juicePrice = new JLabel("500T");
        juicePrice.setBounds(460,320,50,20);
        juicePrice.setForeground(Color.white);
        add( juicePrice);

        Jcount5 = new JTextField("0");
        Jcount5.setBounds(520,320,50,20);
        add(Jcount5);

        CostOfMeals = new JLabel("Cost Of Meals");
        CostOfMeals.setBounds(340,400,100,20);
        CostOfMeals.setForeground(Color.white);
        add(CostOfMeals);

        CostOfMealsText = new JTextField();
        CostOfMealsText.setBounds(460,400,100,20);
        add(CostOfMealsText);

        CostOfDrinks = new JLabel("Cost Of Drinks");
        CostOfDrinks.setBounds(340,425,100,20);
        CostOfDrinks.setForeground(Color.white);
        add(CostOfDrinks);

        CostOfDrinksText = new JTextField();
        CostOfDrinksText.setBounds(460,425,100,20);
        add(CostOfDrinksText);

        CostOfAdditive = new JLabel("Cost Of Add");
        CostOfAdditive.setBounds(340,450,100,20);
        CostOfAdditive.setForeground(Color.white);
        add(CostOfAdditive);

        CostOfAdditiveText = new JTextField();
        CostOfAdditiveText.setBounds(460,450,100,20);
        add(CostOfAdditiveText);

        TotalCost = new JLabel("Total Cost");
        TotalCost.setBounds(340,480,100,20);
        TotalCost.setForeground(Color.white);
        add(TotalCost);

        TotalCostText = new JTextField();
        TotalCostText.setBounds(460,480,100,20);
        add(TotalCostText);

        calculate = new JButton("CALCULATE");
        calculate.setBounds(250,580,120,20);
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum1=0,sum2=0,sum3=0;

                sum1 = 350*(Integer.parseInt(Mcount1.getText())+Integer.parseInt(Mcount2.getText())+Integer.parseInt(Mcount3.getText()))+900*Integer.parseInt(Mcount4.getText())+850*Integer.parseInt(Mcount5.getText());
                CostOfMealsText.setText(String.valueOf(sum1));

                sum2=250*Integer.parseInt(Jcount1.getText()) + 300*(Integer.parseInt(Jcount2.getText())+Integer.parseInt(Jcount3.getText())+Integer.parseInt(Jcount4.getText()))+500*Integer.parseInt(Jcount5.getText());
                CostOfDrinksText.setText(String.valueOf(sum2));

                sum3 = 300*Integer.parseInt(Fcount.getText()) + 100*Integer.parseInt(Scount.getText());
                CostOfAdditiveText.setText(String.valueOf(sum3));

                 total = sum1+sum2+sum3;
                TotalCostText.setText(String.valueOf(total));
            }
        });
        add(calculate);

        order = new JButton("ORDER");
        order.setBounds(100,580,120,20);
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Don't forget click to CALCULATE");
                Client.frame.menuFood.setVisible(false);
                Client.frame.ordered.setVisible(true);
            }
        });
        add(order);

        clear = new JButton("CLEAR");
        clear.setBounds(400,580,120,20);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Mcount1.setText("0");
                    Mcount2.setText("0");
                    Mcount3.setText("0");
                    Mcount4.setText("0");
                    Mcount5.setText("0");

                    Jcount1.setText("0");
                    Jcount2.setText("0");
                    Jcount3.setText("0");
                    Jcount4.setText("0");
                    Jcount5.setText("0");

                    Fcount.setText("0");
                    Scount.setText("0");

                    Client.frame.menuFood.setVisible(false);
                    Client.frame.menuFood.setVisible(true);
                }catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        });
        add(clear);

        back = new JButton("BACK");
        back.setBounds(550,580,120,20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                if (Client.ad.get(0)==1){
                    Client.frame.menuFood.setVisible(false);
                    Client.frame.administrator.setVisible(true);
                }else{
                    Client.frame.menuFood.setVisible(false);
                    Client.frame.mainmenu.setVisible(true);
                }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        add(back);
        add(background);
    }
    public String getData() {
        String data="";
        if(Integer.parseInt(Mcount1.getText()) > 0){
            data+="Humburger";
            data+="---------";
            data+=Mcount1.getText()+'\n';
        }
        if(Integer.parseInt(Mcount2.getText()) > 0){
            data+="Cheeseburger" +"--------" + Mcount2.getText() + '\n';
        }
            if(Integer.parseInt(Mcount3.getText()) > 0){
                data+="Chickenburger" +"-------" + Mcount3.getText() + '\n';
            }
            if(Integer.parseInt(Mcount4.getText()) > 0){
                data+="Bigmack" +"-------------" + Mcount4.getText() + '\n';
            }
            if(Integer.parseInt(Mcount5.getText()) > 0){
                data+="Filet-o-Fish" +"--------" + Mcount5.getText() + '\n';
            }
            if(Integer.parseInt(Jcount1.getText())>0){
                data+="WATER" + "---------------" + Jcount1.getText() + '\n';
            }
            if(Integer.parseInt(Jcount2.getText())>0){
                data+="Coca Cola" + "-----------" + Jcount2.getText() + '\n';
            }
            if(Integer.parseInt(Jcount3.getText())>0){
                data+="FANTA" + "---------------" + Jcount3.getText() + '\n';
            }
            if(Integer.parseInt(Jcount4.getText())>0){
                data+="SPRITE" + "--------------" + Jcount4.getText() + '\n';
            }
            if(Integer.parseInt(Jcount5.getText())>0){
                data+="Juice" + "---------------" + Jcount5.getText() + '\n';
            }
            if(Integer.parseInt(Fcount.getText())>0){
                data+="FRIES" + "---------------" + Fcount.getText() + '\n';
            }
            if(Integer.parseInt(Scount.getText())>0){
                data+="Sous" + "----------------" + Scount.getText() + '\n';
            }
            data += "Total"+"------------------------" + String.valueOf(total);
        System.out.println(data);
        return data;
        }
}
