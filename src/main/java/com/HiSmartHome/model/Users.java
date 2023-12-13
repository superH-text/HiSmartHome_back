package com.HiSmartHome.model;

import java.util.Date;

public class Users {

    private int users_id;
    private String uesrs_name;
    private String users_username;
    private String uesrs_password;
    private String users_gender;
    private String uesrs_age;
    private String users_birthday;
    private String users_phone;
    private String users_email;
    private Date users_cdate;
    private String users_stmp;

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public String getUesrs_name() {
        return uesrs_name;
    }

    public void setUesrs_name(String uesrs_name) {
        this.uesrs_name = uesrs_name;
    }

    public String getUsers_username() {
        return users_username;
    }

    public void setUsers_username(String users_username) {
        this.users_username = users_username;
    }

    public String getUesrs_password() {
        return uesrs_password;
    }

    public void setUesrs_password(String uesrs_password) {
        this.uesrs_password = uesrs_password;
    }

    public String getUsers_gender() {
        return users_gender;
    }

    public void setUsers_gender(String users_gender) {
        this.users_gender = users_gender;
    }

    public String getUesrs_age() {
        return uesrs_age;
    }

    public void setUesrs_age(String uesrs_age) {
        this.uesrs_age = uesrs_age;
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

    public Date getUsers_cdate() {
        return users_cdate;
    }

    public void setUsers_cdate(Date users_cdate) {
        this.users_cdate = users_cdate;
    }

    public String getUsers_stmp() {
        return users_stmp;
    }

    public void setUsers_stmp(String users_stmp) {
        this.users_stmp = users_stmp;
    }

    public Users(int users_id, String uesrs_name, String users_username, String uesrs_password, String users_gender, String uesrs_age, String users_birthday, String users_phone, String users_email, Date users_cdate, String users_stmp) {
        this.users_id = users_id;
        this.uesrs_name = uesrs_name;
        this.users_username = users_username;
        this.uesrs_password = uesrs_password;
        this.users_gender = users_gender;
        this.uesrs_age = uesrs_age;
        this.users_birthday = users_birthday;
        this.users_phone = users_phone;
        this.users_email = users_email;
        this.users_cdate = users_cdate;
        this.users_stmp = users_stmp;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users_id=" + users_id +
                ", uesrs_name='" + uesrs_name + '\'' +
                ", users_username='" + users_username + '\'' +
                ", uesrs_password='" + uesrs_password + '\'' +
                ", users_gender='" + users_gender + '\'' +
                ", uesrs_age='" + uesrs_age + '\'' +
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
