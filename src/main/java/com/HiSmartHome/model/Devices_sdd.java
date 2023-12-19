package com.HiSmartHome.model;

import java.util.Date;

public class Devices_sdd {

    private int devices_sdd_id;
    private String devices_sdd_info;
    private String devices_sdd_type;
    private String devices_sdd_starttime;
    private String devices_sdd_endtime;
    private String devices_sdd_cdate;
    private String devices_sdd_stmp;
    private int users_id;
    private int device_id;

    public int getDevices_sdd_id() {
        return devices_sdd_id;
    }

    public void setDevices_sdd_id(int devices_sdd_id) {
        this.devices_sdd_id = devices_sdd_id;
    }

    public String getDevices_sdd_info() {
        return devices_sdd_info;
    }

    public void setDevices_sdd_info(String devices_sdd_info) {
        this.devices_sdd_info = devices_sdd_info;
    }

    public String getDevices_sdd_type() {
        return devices_sdd_type;
    }

    public void setDevices_sdd_type(String devices_sdd_type) {
        this.devices_sdd_type = devices_sdd_type;
    }

    public String getDevices_sdd_starttime() {
        return devices_sdd_starttime;
    }

    public void setDevices_sdd_starttime(String devices_sdd_starttime) {
        this.devices_sdd_starttime = devices_sdd_starttime;
    }

    public String getDevices_sdd_endtime() {
        return devices_sdd_endtime;
    }

    public void setDevices_sdd_endtime(String devices_sdd_endtime) {
        this.devices_sdd_endtime = devices_sdd_endtime;
    }

    public String getDevices_sdd_cdate() {
        return devices_sdd_cdate;
    }

    public void setDevices_sdd_cdate(String devices_sdd_cdate) {
        this.devices_sdd_cdate = devices_sdd_cdate;
    }

    public String getDevices_sdd_stmp() {
        return devices_sdd_stmp;
    }

    public void setDevices_sdd_stmp(String devices_sdd_stmp) {
        this.devices_sdd_stmp = devices_sdd_stmp;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public int getDevice_id() {
        return device_id;
    }

    public void setDevice_id(int device_id) {
        this.device_id = device_id;
    }

    public Devices_sdd(int devices_sdd_id, String devices_sdd_info, String devices_sdd_type, String devices_sdd_starttime, String devices_sdd_endtime, String devices_sdd_cdate, String devices_sdd_stmp, int users_id, int device_id) {
        this.devices_sdd_id = devices_sdd_id;
        this.devices_sdd_info = devices_sdd_info;
        this.devices_sdd_type = devices_sdd_type;
        this.devices_sdd_starttime = devices_sdd_starttime;
        this.devices_sdd_endtime = devices_sdd_endtime;
        this.devices_sdd_cdate = devices_sdd_cdate;
        this.devices_sdd_stmp = devices_sdd_stmp;
        this.users_id = users_id;
        this.device_id = device_id;
    }

    public Devices_sdd(String devices_sdd_type, String devices_sdd_starttime, String devices_sdd_endtime,String devices_sdd_info) {
        this.devices_sdd_type = devices_sdd_type;
        this.devices_sdd_starttime = devices_sdd_starttime;
        this.devices_sdd_endtime = devices_sdd_endtime;
        this.devices_sdd_info = devices_sdd_info;
    }

    public Devices_sdd(int devices_sdd_id, String devices_sdd_info, String devices_sdd_type, String devices_sdd_starttime, String devices_sdd_endtime) {
        this.devices_sdd_id = devices_sdd_id;
        this.devices_sdd_info = devices_sdd_info;
        this.devices_sdd_type = devices_sdd_type;
        this.devices_sdd_starttime = devices_sdd_starttime;
        this.devices_sdd_endtime = devices_sdd_endtime;
    }

    @Override
    public String toString() {
        return "Devices_sdd{" +
                "devices_sdd_id=" + devices_sdd_id +
                ", devices_sdd_info='" + devices_sdd_info + '\'' +
                ", devices_sdd_type='" + devices_sdd_type + '\'' +
                ", devices_sdd_starttime=" + devices_sdd_starttime +
                ", devices_sdd_endtime=" + devices_sdd_endtime +
                ", devices_sdd_cdate=" + devices_sdd_cdate +
                ", devices_sdd_stmp='" + devices_sdd_stmp + '\'' +
                ", users_id=" + users_id +
                ", device_id=" + device_id +
                '}';
    }
}
