package com.company;

import javax.swing.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;

public class Server {
    private static Connection connection;
    public static void main(String[] args) {

        try{
            connection = Connect.contectDB();
            ServerSocket ss = new ServerSocket(3399);

            while(true){
                System.out.println("waiting for client");
                Socket socket = ss.accept();
                System.out.println("new client connected");

                ServerThread sth = new ServerThread(socket,connection);
                sth.start();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
