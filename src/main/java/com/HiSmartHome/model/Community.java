package com.HiSmartHome.model;

import java.util.Date;

public class Community {

    private int community_id;
    private int community_image;
    private String community_title;
    private String community_info;
    private Date community_cdate;
    private String community_stmp;
    private int users_id;

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public int getCommunity_image() {
        return community_image;
    }

    public void setCommunity_image(int community_image) {
        this.community_image = community_image;
    }

    public String getCommunity_title() {
        return community_title;
    }

    public void setCommunity_title(String community_title) {
        this.community_title = community_title;
    }

    public String getCommunity_info() {
        return community_info;
    }

    public void setCommunity_info(String community_info) {
        this.community_info = community_info;
    }

    public Date getCommunity_cdate() {
        return community_cdate;
    }

    public void setCommunity_cdate(Date community_cdate) {
        this.community_cdate = community_cdate;
    }

    public String getCommunity_stmp() {
        return community_stmp;
    }

    public void setCommunity_stmp(String community_stmp) {
        this.community_stmp = community_stmp;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public Community(int community_id, int community_image, String community_title, String community_info, Date community_cdate, String community_stmp, int users_id) {
        this.community_id = community_id;
        this.community_image = community_image;
        this.community_title = community_title;
        this.community_info = community_info;
        this.community_cdate = community_cdate;
        this.community_stmp = community_stmp;
        this.users_id = users_id;
    }

    @Override
    public String toString() {
        return "Community{" +
                "community_id=" + community_id +
                ", community_image=" + community_image +
                ", community_title='" + community_title + '\'' +
                ", community_info='" + community_info + '\'' +
                ", community_cdate=" + community_cdate +
                ", community_stmp='" + community_stmp + '\'' +
                ", users_id=" + users_id +
                '}';
    }
}
