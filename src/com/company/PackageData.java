package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
     User user;
      ArrayList<User> users;
     String operationType;

    public PackageData() {
    }

    public PackageData(ArrayList<User> users) {
        this.users = users;
    }

    public PackageData(String operationType, User user) {
        this.operationType = operationType;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}