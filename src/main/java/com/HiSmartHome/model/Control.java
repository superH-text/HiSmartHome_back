package com.HiSmartHome.model;

import java.util.Date;

public class Control {

    private int control_id;
    private int control_image;
    private String control_instruction;
    private String control_status;
    private String control_room;
    private String control_time;
    private Date control_cdate;
    private String control_stmp;
    private int users_id;
    private int room_id;
    private int device_id;

    public int getControl_id() {
        return control_id;
    }

    public void setControl_id(int control_id) {
        this.control_id = control_id;
    }

    public int getControl_image() {
        return control_image;
    }

    public void setControl_image(int control_image) {
        this.control_image = control_image;
    }

    public String getControl_instruction() {
        return control_instruction;
    }

    public void setControl_instruction(String control_instruction) {
        this.control_instruction = control_instruction;
    }

    public String getControl_status() {
        return control_status;
    }

    public void setControl_status(String control_status) {
        this.control_status = control_status;
    }

    public String getControl_room() {
        return control_room;
    }

    public void setControl_room(String control_room) {
        this.control_room = control_room;
    }

    public String getControl_time() {
        return control_time;
    }

    public void setControl_time(String control_time) {
        this.control_time = control_time;
    }

    public Date getControl_cdate() {
        return control_cdate;
    }

    public void setControl_cdate(Date control_cdate) {
        this.control_cdate = control_cdate;
    }

    public String getControl_stmp() {
        return control_stmp;
    }

    public void setControl_stmp(String control_stmp) {
        this.control_stmp = control_stmp;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getDevice_id() {
        return device_id;
    }

    public void setDevice_id(int device_id) {
        this.device_id = device_id;
    }

    public Control(int control_id, int control_image, String control_instruction, String control_status, String control_room, String control_time, Date control_cdate, String control_stmp, int users_id, int room_id, int device_id) {
        this.control_id = control_id;
        this.control_image = control_image;
        this.control_instruction = control_instruction;
        this.control_status = control_status;
        this.control_room = control_room;
        this.control_time = control_time;
        this.control_cdate = control_cdate;
        this.control_stmp = control_stmp;
        this.users_id = users_id;
        this.room_id = room_id;
        this.device_id = device_id;
    }

    public Control(int control_image, String control_instruction, String control_status, String control_time) {
        this.control_image = control_image;
        this.control_instruction = control_instruction;
        this.control_status = control_status;
        this.control_time = control_time;
    }

    public Control(int control_id, int control_image, String control_instruction, String control_status, String control_time) {
        this.control_id = control_id;
        this.control_image = control_image;
        this.control_instruction = control_instruction;
        this.control_status = control_status;
        this.control_time = control_time;
    }

    @Override
    public String toString() {
        return "Control{" +
                "control_id=" + control_id +
                ", control_image=" + control_image +
                ", control_instruction='" + control_instruction + '\'' +
                ", control_status='" + control_status + '\'' +
                ", control_room='" + control_room + '\'' +
                ", control_time=" + control_time +
                ", control_cdate=" + control_cdate +
                ", control_stmp='" + control_stmp + '\'' +
                ", users_id=" + users_id +
                ", room_id=" + room_id +
                ", device_id=" + device_id +
                '}';
    }
}
