package com.HiSmartHome.dao;

import com.HiSmartHome.model.Control;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControlDao {

    QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //增加操作
    public int control_add(Control control){
        int control_add = 0;
        try {
            control_add = queryRunner.update(
                    "insert into control_record(control_record_image,control_record_time,control_record_status,control_record_instruction) values (?,?,?,?)",
                    control.getControl_image(),control.getControl_time(),control.getControl_status(),control.getControl_instruction()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return control_add;
    }

    //查询所有
    public List<Control> control_findAll(){

        List<Control> controlList = new ArrayList<Control>();

        try {
            controlList = queryRunner.query("select * from control_record",new BeanListHandler<Control>(Control.class));
            System.out.println(controlList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return controlList;
    }

    //根据id查询
    public Control findcontrolById(int id){
        Control control = null;
        try {
            control = queryRunner.query("select * from control_record where control_record_id=?",
                    new BeanHandler<Control>(Control.class),
                    id
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return control;
    }

    //更改操作
    public int control_update(Control control){
        int control_update = 0;
        try {
            control_update = queryRunner.update(
                    "update control_record set control_record_image=?,control_record_time=?,control_record_status=?,control_record_instruction=? where control_record_id=?",
                    control.getControl_image(),control.getControl_time(),control.getControl_status(),control.getControl_instruction()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return control_update;
    }

    //删除操作
    public int control_delete(int id){
        int control_delete = 0;
        try {
            control_delete = queryRunner.update(
                    "delete from control_record where control_record_id=?",
                    id
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return control_delete;
    }

}

