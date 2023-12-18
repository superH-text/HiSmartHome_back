package com.HiSmartHome.dao;

import com.HiSmartHome.model.Authorization;

import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorizationDao {
    static QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //增加操作
    public int authorization_add(Authorization authorization){
        int authorization_add = 0;
        try {
            authorization_add = queryRunner.update(
                    "insert into authorization(authorization_status,authorization_starttime,authorization_endtime) values (?,?,?)",
                    authorization.getAuthorization_status(),authorization.getAuthorization_starttime(),authorization.getAuthorization_endtime()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authorization_add;
    }

    //查询所有
    public List<Authorization> authorization_findAll(){

        List<Authorization> authorizationList = new ArrayList<Authorization>();

        try {
            authorizationList = queryRunner.query("select * from authorization",new BeanListHandler<Authorization>(Authorization.class));
            System.out.println(authorizationList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authorizationList;
    }

    //根据id查询
    public static Authorization findAuthorizationById(int id){
        Authorization authorization = null;
        try {
            authorization = queryRunner.query("select * from authorization where authorization_id=?",
                    new BeanHandler<Authorization>(Authorization.class),
                    id
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return authorization;
    }

    //更改操作
    public int authorization_update(Authorization authorization){
        int authorization_update = 0;
        try {
            authorization_update = queryRunner.update(
                    "update authorization set authorization_status=?,authorization_starttime=?,authorization_endtime=? where authorization_id=?",
                    authorization.getAuthorization_id(),authorization.getAuthorization_status(),authorization.getAuthorization_starttime(),authorization.getAuthorization_endtime()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authorization_update;
    }

    //删除操作
    public int authorization_delete(int id){
        int authorization_delete = 0;
        try {
            authorization_delete = queryRunner.update(
                    "delete from community where authorization_id=?",
                    id
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authorization_delete;
    }

}
