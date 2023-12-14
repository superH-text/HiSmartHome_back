package com.HiSmartHome.dao;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DevicesDao {

    QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //增加操作
    public int devices_add(Devices devices){
        int devices_add = 0;
        try {
            devices_add = queryRunner.update(
                    "insert into devices(device_did,device_name,device_type) values (?,?,?)",
                    devices.getDevice_did(),devices.getDevice_name(),devices.getDevice_type()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devices_add;
    }

    //查询所有
    public List<Devices> devices_findAll(){

        List<Devices> devicesList = null;

        try {
            devicesList = queryRunner.query("select * from devices",new BeanListHandler<Devices>(Devices.class));
            System.out.println(devicesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devicesList;
    }

}
