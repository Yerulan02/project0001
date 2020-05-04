package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class Connect {
    public static Connection connection = null;
    public static Statement statement = null;
    public static ResultSet resultSet = null;
    public static String url = "jdbc:mysql://localhost/database1?serverTimezone=Europe/Moscow&useSSL=false";
    public static String user = "root";
    public static String pass = "";

    public static Connection contectDB(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,pass);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    abstract void Costs();

}
