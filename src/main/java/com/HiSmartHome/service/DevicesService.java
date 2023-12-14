package com.HiSmartHome.service;

import com.HiSmartHome.dao.DevicesDao;
import com.HiSmartHome.model.Devices;

import java.util.List;

public class DevicesService {

    DevicesDao devicesDao = new DevicesDao();

    public List<Devices> getAllDevicesService() {
        return devicesDao.devices_findAll();
    }

    public Devices getDeviceByIdService(int id) {
        return devicesDao.findDevicesById(id);
    }

    public int addDeviceService(Devices devices) {
        return devicesDao.devices_add(devices);
    }

    public int updateDeviceService(Devices devices) {
        return devicesDao.devices_update(devices);
    }

    public int deleteDeviceService(int id) {
        return devicesDao.devices_delete(id);
    }
}
