package com.company;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;

public class ServerThread extends Thread{

    Connection connection;
    PreparedStatement preparedStatement;
    Socket socket;
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;


    public ServerThread(Socket socket, Connection connection) {
        this.socket = socket;
        this.connection = connection;
        try {
            inputStream = new ObjectInputStream(this.socket.getInputStream());
            outputStream = new ObjectOutputStream(this.socket.getOutputStream());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void run(){
        try{
            PackageData pd = null;
            while ((pd = (PackageData)inputStream.readObject()) != null) {
                if(pd.getOperationType().equalsIgnoreCase("sign_up")){
                    try {
                        User user = pd.getUser();
                        addUsersToDB(user);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else if (pd.getOperationType().equalsIgnoreCase("Get_Users")){
                    try {
                        ArrayList<User> users = getUsersFromDb();
                        PackageData packageData = new PackageData(users);
                        outputStream.writeObject(packageData);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }else if(pd.getOperationType().equalsIgnoreCase("delete_user")){
                    User user = pd.getUser();
                    deleteUserFromDB(user);
                }else {
                    break;
                }
            }
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }
    public void addUsersToDB(User user){
        try {
            connection= Connect.contectDB();
            String query = "insert into users (id, name, surname, Gender, birthday, number, password, helpWord,answer,admin) values (?,?,?,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getSurname());
            preparedStatement.setString(4, user.getGen());
            preparedStatement.setString(5, user.getBirthday());
            preparedStatement.setString(6, user.getNumber());
            preparedStatement.setString(7, user.getPassword());
            preparedStatement.setString(8, user.getHelpWord());
            preparedStatement.setString(9, user.getAnswer());
            preparedStatement.setInt(10,user.getAdmin());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<User> getUsersFromDb() {
        ArrayList<User> users = new ArrayList<>();
        try {
            connection= Connect.contectDB();
            Statement st = connection.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet resultSet = st.executeQuery(sql);
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String gen = resultSet.getString("Gender");
                String birthday = resultSet.getString("birthday");
                String number = resultSet.getString("number");
                String password = resultSet.getString("password");
                String helpWord = resultSet.getString("helpWord");
                String answer = resultSet.getString("answer");
                int admin = resultSet.getInt("admin");
                users.add(new User(id, name,surname,gen,birthday,number,password,helpWord, answer,admin));
            }
            st.close();
        } catch (Exception e011111111) {
            e011111111.printStackTrace();
        }
        return users;
    }
    public void deleteUserFromDB(User user)  {
        try {
            connection= Connect.contectDB();
            Integer d = user.getId();
            String query = "delete from users where id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,d);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (Exception es){
            es.printStackTrace();
        }
    }
}
