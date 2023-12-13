package com.HiSmartHome.model;

import java.util.Date;

public class Brand {

    private int brand_id;
    private String brand_namel;
    private Date brand_cdate;
    private String brand_stmp;

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_namel() {
        return brand_namel;
    }

    public void setBrand_namel(String brand_namel) {
        this.brand_namel = brand_namel;
    }

    public Date getBrand_cdate() {
        return brand_cdate;
    }

    public void setBrand_cdate(Date brand_cdate) {
        this.brand_cdate = brand_cdate;
    }

    public String getBrand_stmp() {
        return brand_stmp;
    }

    public void setBrand_stmp(String brand_stmp) {
        this.brand_stmp = brand_stmp;
    }

    public Brand(int brand_id, String brand_namel, Date brand_cdate, String brand_stmp) {
        this.brand_id = brand_id;
        this.brand_namel = brand_namel;
        this.brand_cdate = brand_cdate;
        this.brand_stmp = brand_stmp;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brand_id=" + brand_id +
                ", brand_namel='" + brand_namel + '\'' +
                ", brand_cdate=" + brand_cdate +
                ", brand_stmp='" + brand_stmp + '\'' +
                '}';
    }
}
