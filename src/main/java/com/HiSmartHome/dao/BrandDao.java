package com.HiSmartHome.dao;

import com.HiSmartHome.model.Brand;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class BrandDao {

    QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //增加操作
    public int brand_add(Brand brand){
        int brand_add = 0;
        try {
            brand_add = queryRunner.update(
                    "insert into brand(brand_name,brand_cdate) values(?,?)",
                    brand.getBrand_namel(),brand.getBrand_cdate()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return brand_add;
    }
}
