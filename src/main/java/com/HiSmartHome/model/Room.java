package com.HiSmartHome.model;

import java.util.Date;

public class Room {

    private int room_id;
    private int room_rid;
    private String room_name;
    private String room_type;
    private Date room_cdate;
    private String room_stmp;

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getRoom_rid() {
        return room_rid;
    }

    public void setRoom_rid(int room_rid) {
        this.room_rid = room_rid;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Date getRoom_cdate() {
        return room_cdate;
    }

    public void setRoom_cdate(Date room_cdate) {
        this.room_cdate = room_cdate;
    }

    public String getRoom_stmp() {
        return room_stmp;
    }

    public void setRoom_stmp(String room_stmp) {
        this.room_stmp = room_stmp;
    }

    public Room(int room_id, int room_rid, String room_name, String room_type, Date room_cdate, String room_stmp) {
        this.room_id = room_id;
        this.room_rid = room_rid;
        this.room_name = room_name;
        this.room_type = room_type;
        this.room_cdate = room_cdate;
        this.room_stmp = room_stmp;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_id=" + room_id +
                ", room_rid=" + room_rid +
                ", room_name='" + room_name + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_cdate=" + room_cdate +
                ", room_stmp='" + room_stmp + '\'' +
                '}';
    }
}
