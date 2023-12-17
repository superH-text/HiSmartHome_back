package com.HiSmartHome.service;

import com.HiSmartHome.dao.ControlDao;
import com.HiSmartHome.model.Control;
import com.HiSmartHome.model.Devices;

import java.util.List;

public class ControlService {

    ControlDao controlDao = new ControlDao();

    public List<Control> getAllControlService() {
        return controlDao.control_findAll();
    }

    public Control getControlByIdService(int id) {
        return controlDao.findcontrolById(id);
    }

    public int addControlService(Control control) {
        return controlDao.control_add(control);
    }

    public int updateControlService(Control control) {
        return controlDao.control_update(control);
    }

    public int deleteControlService(int id) {
        return controlDao.control_delete(id);
    }
}
