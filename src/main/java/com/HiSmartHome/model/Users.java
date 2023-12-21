package com.HiSmartHome.model;

import java.util.Date;

public class Users {

    private int users_id;
    private String users_name;
    private String users_username;
    private String users_password;
    private String users_gender;
    private String users_age;
    private String users_birthday;
    private String users_phone;
    private String users_email;
    private String users_cdate;
    private String users_stmp;

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public String getUsers_username() {
        return users_username;
    }

    public void setUsers_username(String users_username) {
        this.users_username = users_username;
    }

    public String getUsers_password() {
        return users_password;
    }

    public void setUsers_password(String users_password) {
        this.users_password = users_password;
    }

    public String getUsers_gender() {
        return users_gender;
    }

    public void setUsers_gender(String users_gender) {
        this.users_gender = users_gender;
    }

    public String getUsers_age() {
        return users_age;
    }

    public void setUsers_age(String users_age) {
        this.users_age = users_age;
    }

    public String getUsers_birthday() {
        return users_birthday;
    }

    public void setUsers_birthday(String users_birthday) {
        this.users_birthday = users_birthday;
    }

    public String getUsers_phone() {
        return users_phone;
    }

    public void setUsers_phone(String users_phone) {
        this.users_phone = users_phone;
    }

    public String getUsers_email() {
        return users_email;
    }

    public void setUsers_email(String users_email) {
        this.users_email = users_email;
    }

    public String getUsers_cdate() {
        return users_cdate;
    }

    public void setUsers_cdate(String users_cdate) {
        this.users_cdate = users_cdate;
    }

    public String getUsers_stmp() {
        return users_stmp;
    }

    public void setUsers_stmp(String users_stmp) {
        this.users_stmp = users_stmp;
    }

    public Users(int users_id, String uesrs_name, String users_username, String uesrs_password, String users_gender, String uesrs_age, String users_birthday, String users_phone, String users_email, String users_cdate, String users_stmp) {
        this.users_id = users_id;
        this.users_name = uesrs_name;
        this.users_username = users_username;
        this.users_password = uesrs_password;
        this.users_gender = users_gender;
        this.users_age = uesrs_age;
        this.users_birthday = users_birthday;
        this.users_phone = users_phone;
        this.users_email = users_email;
        this.users_cdate = users_cdate;
        this.users_stmp = users_stmp;
    }

    public Users(String users_name, String users_username, String users_password, String users_gender, String users_age, String users_birthday, String users_phone, String users_email) {
        this.users_name = users_name;
        this.users_username = users_username;
        this.users_password = users_password;
        this.users_gender = users_gender;
        this.users_age = users_age;
        this.users_birthday = users_birthday;
        this.users_phone = users_phone;
        this.users_email = users_email;
    }

    public Users(String users_username, String users_password, String users_phone, String users_email) {
        this.users_username = users_username;
        this.users_password = users_password;
        this.users_phone = users_phone;
        this.users_email = users_email;
    }

    public Users(String users_username, String users_password) {
        this.users_username = users_username;
        this.users_password = users_password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users_id=" + users_id +
                ", users_name='" + users_name + '\'' +
                ", users_username='" + users_username + '\'' +
                ", users_password='" + users_password + '\'' +
                ", users_gender='" + users_gender + '\'' +
                ", users_age='" + users_age + '\'' +
                ", users_birthday='" + users_birthday + '\'' +
                ", users_phone='" + users_phone + '\'' +
                ", users_email='" + users_email + '\'' +
                ", users_cdate=" + users_cdate +
                ", users_stmp='" + users_stmp + '\'' +
                '}';
    }

    public Users() {
        super();
    }
}
