package com.HiSmartHome.dao;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.model.Devices_sdd;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Devices_sddDao {

    QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //增加操作
    public int devices_sdd_add(Devices_sdd devices_sdd){
        int devices_sdd_add = 0;
        try {
            devices_sdd_add = queryRunner.update(
                    "insert into devices_sdd(devices_sdd_type,devices_sdd_starttime,devices_sdd_endtime,devices_sdd_info) values (?,?,?,?)",
                    devices_sdd.getDevices_sdd_type(),devices_sdd.getDevices_sdd_starttime(),devices_sdd.getDevices_sdd_endtime(),devices_sdd.getDevices_sdd_info()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devices_sdd_add;
    }

    //查询所有
    public List<Devices_sdd> devices_sdd_findAll(){

        List<Devices_sdd> devices_sddList = new ArrayList<Devices_sdd>();

        try {
            devices_sddList = queryRunner.query("select * from devices_sdd",new BeanListHandler<Devices_sdd>(Devices_sdd.class));
            System.out.println(devices_sddList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devices_sddList;
    }

    //根据id查询
    public Devices_sdd findDevices_sddById(int id){
        Devices_sdd devices_sdd = null;
        try {
            devices_sdd = queryRunner.query("select * from devices_sdd where devices_sdd_id=?",
                    new BeanHandler<Devices_sdd>(Devices_sdd.class),
                    id
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return devices_sdd;
    }

    //更改操作
    public int devices_sdd_update(Devices_sdd devices_sdd){
        int devices_sdd_update = 0;
        try {
            devices_sdd_update = queryRunner.update(
                    "update devices_sdd set devices_sdd_type=?,devices_sdd_starttime=?,devices_sdd_endtime=?,devices_sdd_info=? where devices_sdd_id=?",
                    devices_sdd.getDevices_sdd_id(),devices_sdd.getDevices_sdd_type(),devices_sdd.getDevices_sdd_starttime(),devices_sdd.getDevices_sdd_endtime(),devices_sdd.getDevices_sdd_info()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devices_sdd_update;
    }

    //删除操作
    public int devices_sdd_delete(int id){
        int devices_sdd_delete = 0;
        try {
            devices_sdd_delete = queryRunner.update(
                    "delete from  devices_sdd where devices_sdd_id=?",
                    id
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devices_sdd_delete;
    }

}


