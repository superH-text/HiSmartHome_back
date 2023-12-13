package com.HiSmartHome.model;

import java.util.Date;

public class Devices {

    private int device_id;
    private int device_did;
    private String device_name;
    private String device_type;
    private Date users_cdate;
    private String users_stmp;
    private int users_id;
    private int brand_id;
    private int room_id;

    public int getDevice_id() {
        return device_id;
    }

    public void setDevice_id(int device_id) {
        this.device_id = device_id;
    }

    public int getDevice_did() {
        return device_did;
    }

    public void setDevice_did(int device_did) {
        this.device_did = device_did;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
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

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public Devices(int device_id, int device_did, String device_name, String device_type, Date users_cdate, String users_stmp, int users_id, int brand_id, int room_id) {
        this.device_id = device_id;
        this.device_did = device_did;
        this.device_name = device_name;
        this.device_type = device_type;
        this.users_cdate = users_cdate;
        this.users_stmp = users_stmp;
        this.users_id = users_id;
        this.brand_id = brand_id;
        this.room_id = room_id;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "device_id=" + device_id +
                ", device_did=" + device_did +
                ", device_name='" + device_name + '\'' +
                ", device_type='" + device_type + '\'' +
                ", users_cdate=" + users_cdate +
                ", users_stmp='" + users_stmp + '\'' +
                ", users_id=" + users_id +
                ", brand_id=" + brand_id +
                ", room_id=" + room_id +
                '}';
    }
}
