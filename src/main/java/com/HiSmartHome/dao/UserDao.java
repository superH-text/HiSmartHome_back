package com.HiSmartHome.dao;

import com.HiSmartHome.model.Users;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
     //连接数据库，进行增删改查
        //1.使用dbutils工具进行数据库访问
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //此时将数据库作为参数传递给QueryRunner对象，方便我们后续进行其他操作
        //查询所有
    public List<Users> findAll() {
        List<Users> list = new ArrayList<>();
        try {
            list = qr.query("select * from users",
                    new BeanListHandler<Users>(Users.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }
    //简单查询
    public Users findUserByid(int id) {
        Users users =null;
        try {
            users = qr.query(
                    "select * from users where users_id=?",
                    new BeanHandler<Users>(Users.class),id
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }




}
