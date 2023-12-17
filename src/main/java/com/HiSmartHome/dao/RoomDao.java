package com.HiSmartHome.dao;

import com.HiSmartHome.model.Room;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDao {

    QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //增加操作
    public int room_add(Room room){
        int room_add = 0;
        try {
            room_add = queryRunner.update(
                    "insert into room(room_rid,room_name,room_type) values (?,?,?)",
                    room.getRoom_rid(),room.getRoom_name(),room.getRoom_type()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return room_add;
    }

    //查询所有
    public List<Room> room_findAll(){

        List<Room> roomList = new ArrayList<Room>();

        try {
            roomList = queryRunner.query("select * from room",new BeanListHandler<Room>(Room.class));
            System.out.println(roomList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    //根据id查询
    public Room findRoomById(int id){
        Room room = null;
        try {
            room = queryRunner.query("select * from room where room_id=?",
                    new BeanHandler<Room>(Room.class),
                    id
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return room;
    }

    //更改操作
    public int room_update(Room room){
        int room_update = 0;
        try {
            room_update = queryRunner.update(
                    "update devices set room_rid=?,room_name=?,room_type=? where room_id=?",
                    room.getRoom_rid(),room.getRoom_name(),room.getRoom_type(),room.getRoom_id()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return room_update;
    }

    //删除操作
    public int room_delete(int id){
        int rooom_delete = 0;
        try {
            rooom_delete = queryRunner.update(
                    "delete from room where room_id=?",
                    id
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rooom_delete;
    }

}
