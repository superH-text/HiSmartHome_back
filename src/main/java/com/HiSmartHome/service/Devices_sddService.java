package com.HiSmartHome.service;

import com.HiSmartHome.dao.AuthorizationDao;
import com.HiSmartHome.dao.Devices_sddDao;
import com.HiSmartHome.model.Authorization;
import com.HiSmartHome.model.Devices_sdd;

import java.util.List;

public class Devices_sddService {
    Devices_sddDao devices_sddDao=new Devices_sddDao();
    public List<Devices_sdd> getAllDevices_sddService() {
        return devices_sddDao.devices_sdd_findAll();
    }

    public Devices_sdd getDevices_sddByIdService(int id) {
        return devices_sddDao.findDevices_sddById(id);
    }

    public int addDevices_sddService(Devices_sdd devices_sdd) {
        return devices_sddDao.devices_sdd_add(devices_sdd);
    }

    public int updateDevices_sddService(Devices_sdd devices_sdd) {
        return devices_sddDao.devices_sdd_update(devices_sdd);
    }

    public int deleteDevices_sddService(int id) {
        return devices_sddDao.devices_sdd_delete(id);
    }
}
