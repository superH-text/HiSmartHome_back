package com.HiSmartHome.test;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Users;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UsersTest {
    UserDao userDao;
    @Test
    public void test(){
        List<Users> list = null;
        userDao = new UserDao();
        list = userDao.findAll();
        System.out.println(list);
    }
    @Test
    public void test1(){
        Users users = null;
        userDao = new UserDao();
        users = userDao.findUserByid(4);
        System.out.println(users);
    }

}
