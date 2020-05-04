package com.company;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String name;
    private String surname;
    private String gen;
    private String birthday;
    private String number;
    private String password;
    private String helpWord;
    private String answer;
    private int admin;

    public User() {
    }

    public User(Integer id, String name, String surname, String gen, String birthday, String number, String password, String helpWord, String answer, int admin) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gen = gen;
        this.birthday = birthday;
        this.number = number;
        this.password = password;
        this.helpWord = helpWord;
        this.answer = answer;
        this.admin = admin;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHelpWord() {
        return helpWord;
    }

    public void setHelpWord(String helpWord) {
        this.helpWord = helpWord;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return id + "    " + name + "     " + surname + "     " +  number + "     " + password;
    }
}
