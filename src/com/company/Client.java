package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Client {
    public  static  MainJFrame frame;
    public static ObjectOutputStream outputStream;
    public static ObjectInputStream inputStream;
    public static Socket socket;
    public static ArrayList<Integer> ad = new ArrayList<>();
    public static void connectToServer() {
        try {
            socket = new Socket("127.0.0.1", 3399);
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            inputStream = new ObjectInputStream((socket.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void connect(PackageData pd){
    if(pd.getOperationType().equalsIgnoreCase("sign_up")){
        try {
            outputStream.writeObject(pd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }else if(pd.getOperationType().equalsIgnoreCase("delete_user")){
        try {
            outputStream.writeObject(pd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
        public static ArrayList<User> getUsers() {

        ArrayList<User> users = new ArrayList<>();
        PackageData pd = new PackageData();
        pd.setOperationType("Get_Users");
        pd.setUsers(users);
        try {
            outputStream.writeObject(pd);
            if ((pd = (PackageData) inputStream.readObject()) != null) {
                users = pd.getUsers();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    public static void main(String[] args) {
        connectToServer();
        frame = new MainJFrame();
        frame.setVisible(true);
    }
}

