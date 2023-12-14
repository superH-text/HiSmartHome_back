package com.HiSmartHome.test;

import com.HiSmartHome.dao.DevicesDao;
import com.HiSmartHome.model.Devices;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DevicesTest {

    @Test
    public void test1(){
        Devices devices = new Devices("Chfbfh","欧普智能读写台灯","学校");
        DevicesDao devicesDao = new DevicesDao();

        devicesDao.devices_add(devices);
    }

    @Test
    public void test2(){
        List<Devices> devicesList = null;
        DevicesDao devicesDao = new DevicesDao();
        devicesList = devicesDao.devices_findAll();
        System.out.println(devicesList);
    }

    @Test
    public void test3(){
        DevicesDao devicesDao = new DevicesDao();
        Devices device = devicesDao.findDevicesById(4);
        System.out.println(device);
    }

    @Test
    public void test4(){
        //测试修改
        DevicesDao devicesDao = new DevicesDao();
        Devices device = devicesDao.findDevicesById(3);
        device.setDevice_did("1166fgdvg");
        device.setDevice_name("监控");
        device.setDevice_type("办公室");
        devicesDao.devices_update(device);
        System.out.println(device);
    }

    @Test
    public void test5(){
        //测试删除
        DevicesDao devicesDao = new DevicesDao();
        devicesDao.devices_delete(4);
        System.out.println("删除成功");
    }
}
