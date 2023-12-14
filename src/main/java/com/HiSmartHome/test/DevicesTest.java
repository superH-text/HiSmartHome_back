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
        List<Devices> devicesList = new ArrayList<Devices>();
        DevicesDao devicesDao = new DevicesDao();
        devicesList = devicesDao.devices_findAll();
        System.out.println(devicesList);
    }
}
