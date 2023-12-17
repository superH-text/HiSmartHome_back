package com.HiSmartHome.service;

import com.HiSmartHome.dao.RoomDao;
import com.HiSmartHome.model.Devices;
import com.HiSmartHome.model.Room;

import java.util.List;

public class RoomService {

    RoomDao roomDao = new RoomDao();

    public List<Room> getAllRoomService() {
        return roomDao.room_findAll();
    }

    public Room getRoomByIdService(int id) {
        return roomDao.findRoomById(id);
    }

    public int addRoomService(Room room) {
        return roomDao.room_add(room);
    }

    public int updateRoomService(Room room) {
        return roomDao.room_update(room);
    }

    public int deleteRoomService(int id) {
        return roomDao.room_delete(id);
    }
}
