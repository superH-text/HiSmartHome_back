package com.HiSmartHome.dao;

import com.HiSmartHome.model.Community;
import com.HiSmartHome.model.Devices;
import com.HiSmartHome.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommunityDao {
    QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //增加操作
    public int community_add(Community community){
        int community_add = 0;
        try {
            community_add = queryRunner.update(
                    "insert into community(community_title,community_info) values (?,?)",
                    community.getCommunity_title(),community.getCommunity_info()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return community_add;
    }

    //查询所有
    public List<Community> community_findAll(){

        List<Community> communityList = new ArrayList<Community>();

        try {
            communityList = queryRunner.query("select * from community",new BeanListHandler<Community>(Community.class));
            System.out.println(communityList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return communityList;
    }

    //根据id查询
    public Community findCommunityById(int id){
        Community community = null;
        try {
            community = queryRunner.query("select * from community where community_id=?",
                    new BeanHandler<Community>(Community.class),
                    id
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return community;
    }

    //更改操作
    public int community_update(Community community){
        int community_update = 0;
        try {
            community_update = queryRunner.update(
                    "update community set community_id=?,community_title=?,community_info=? where device_id=?",
                    community.getCommunity_id(),community.getCommunity_title(),community.getCommunity_info()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return community_update;
    }

    //删除操作
    public int community_delete(int id){
        int community_delete = 0;
        try {
            community_delete = queryRunner.update(
                    "delete from community where community_id=?",
                    id
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return community_delete;
    }

}
