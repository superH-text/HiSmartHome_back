package com.HiSmartHome.dao;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
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

        List<Devices> devicesList = new ArrayList<Devices>();

        try {
            devicesList = queryRunner.query("select * from devices",new BeanListHandler<Devices>(Devices.class));
            System.out.println(devicesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devicesList;
    }

    //根据id查询
    public Devices findDevicesById(int id){
        Devices devices = null;
        try {
            devices = queryRunner.query("select * from devices where device_id=?",
                    new BeanHandler<Devices>(Devices.class),
                    id
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return devices;
    }

    //更改操作
    public int devices_update(Devices devices){
        int devices_update = 0;
        try {
            devices_update = queryRunner.update(
                    "update devices set device_did=?,device_name=?,device_type=? where device_id=?",
                    devices.getDevice_did(),devices.getDevice_name(),devices.getDevice_type(),devices.getDevice_id()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devices_update;
    }

    //删除操作
    public int devices_delete(int id){
        int devices_delete = 0;
        try {
            devices_delete = queryRunner.update(
                    "delete from devices where device_id=?",
                    id
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devices_delete;
    }

}
