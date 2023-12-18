package com.HiSmartHome.model;

import java.util.Date;

public class Authorization {

    private int authorization_id;
    private String authorization_status;
    private Date authorization_starttime;
    private Date authorization_endtime;
    private Date authorization_cdate;
    private String authorization_stmp;
    private int users_id;
    private int devide_id;

    public int getAuthorization_id() {
        return authorization_id;
    }

    public void setAuthorization_id(int authorization_id) {
        this.authorization_id = authorization_id;
    }

    public String getAuthorization_status() {
        return authorization_status;
    }

    public void setAuthorization_status(String authorization_status) {
        this.authorization_status = authorization_status;
    }

    public Date getAuthorization_starttime() {
        return authorization_starttime;
    }

    public void setAuthorization_starttime(Date authorization_starttime) {
        this.authorization_starttime = authorization_starttime;
    }

    public Date getAuthorization_endtime() {
        return authorization_endtime;
    }

    public void setAuthorization_endtime(Date authorization_endtime) {
        this.authorization_endtime = authorization_endtime;
    }

    public Date getAuthorization_cdate() {
        return authorization_cdate;
    }

    public void setAuthorization_cdate(Date authorization_cdate) {
        this.authorization_cdate = authorization_cdate;
    }

    public String getAuthorization_stmp() {
        return authorization_stmp;
    }

    public void setAuthorization_stmp(String authorization_stmp) {
        this.authorization_stmp = authorization_stmp;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public int getDevide_id() {
        return devide_id;
    }

    public void setDevide_id(int devide_id) {
        this.devide_id = devide_id;
    }

    public Authorization(int authorization_id, String authorization_status, Date authorization_starttime, Date authorization_endtime, Date authorization_cdate, String authorization_stmp, int users_id, int devide_id) {
        this.authorization_id = authorization_id;
        this.authorization_status = authorization_status;
        this.authorization_starttime = authorization_starttime;
        this.authorization_endtime = authorization_endtime;
        this.authorization_cdate = authorization_cdate;
        this.authorization_stmp = authorization_stmp;
        this.users_id = users_id;
        this.devide_id = devide_id;
    }

    @Override
    public String toString() {
        return "Authorization{" +
                "authorization_id=" + authorization_id +
                ", authorization_status='" + authorization_status + '\'' +
                ", authorization_starttime=" + authorization_starttime +
                ", authorization_endtime=" + authorization_endtime +
                ", authorization_cdate=" + authorization_cdate +
                ", authorization_stmp='" + authorization_stmp + '\'' +
                ", users_id=" + users_id +
                ", devide_id=" + devide_id +
                '}';
    }
}
