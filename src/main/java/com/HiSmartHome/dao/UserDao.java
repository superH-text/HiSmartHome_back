package com.HiSmartHome.dao;

import com.HiSmartHome.model.Users;
import com.HiSmartHome.utils.C3P0Utils;
import com.HiSmartHome.utils.DBUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        return list;
    }
    //根据id进行单次查询
    public Users findUserByid(int id) {
        QueryRunner qr = null;
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
    //删除角色（注销操作）
    public int delUserByid(int id){
        int delete = 0;
        try {
            delete = qr.update("delete from users where users_id=?", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return delete;
    }
    //修改操作
    public int updateUser(Users users){
        int update = 0;
        try {
            update = qr.update("update  users set users_name=?,users_username=?,users_password=?,users_age=?,users_gender=?,users_birthday=?,users_email=?,users_phone=? where users_id=?",
                    users.getUsers_name(), users.getUsers_username(),users.getUsers_password(),users.getUsers_age(),users.getUsers_gender(),users.getUsers_birthday(),users.getUsers_email(),users.getUsers_phone(), users.getUsers_id());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }
    //注册和登录，根据用户名进行查询
    public boolean findUserByusername(String username){
        Users users =null;
        try {
            users = qr.query("select * from users where user_username=?",new BeanHandler<Users>(Users.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (users == null){
            return false;
        }else {
            return true;
        }
    }
    //注册 增加
    public int usersadd(Users users){
        int insert =0;
        try {
            insert = qr.update(
                    "insert into users(users_username,users_password,users_email,users_phone) values (?,?,?,?)",
                    users.getUsers_username(),users.getUsers_password(),users.getUsers_email(),users.getUsers_phone());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insert;
    }
//    public boolean insert(Users user) {
//        final Connection connection = DBUtils.getConnection();
//        final String sql = "insert into users(users_username,users_password) values(?,?)";
//        try {
//            final PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, user.getUsers_username());
//            preparedStatement.setString(2, user.getUesrs_password());
//            preparedStatement.executeUpdate();
//            return preparedStatement.getUpdateCount() != 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        } finally {
//            DBUtils.closeConnection();
//        }
//    }

    //登录操作
    public Users Login(String username,String password){
        Users users =null;
        try {
            users = qr.query("select * from users where users_username=? and users_password=?",new BeanHandler<Users>(Users.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

//    public boolean select(Users user) {
//        final Connection connection = DBUtils.getConnection();
//        final String sql = "select * from user where name = ? and password = ?";
//        try {
//            final PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, user.getUsers_username());
//            preparedStatement.setString(2, user.getUesrs_password());
//            ResultSet resultSet = preparedStatement.executeQuery();
//            return resultSet.next();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        } finally {
//            DBUtils.closeConnection();
//        }
//    }
}
