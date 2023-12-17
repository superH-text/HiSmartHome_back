package com.HiSmartHome.test;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Users;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    @Test
    public void test2(){
        Users users = new Users();
        users.setUesrs_name("张三");
        users.setUsers_username("zhangsan");
        users.setUesrs_password("123456");
        users.setUesrs_age("25");
        users.setUsers_birthday("1996-01-01");
        users.setUsers_email("zhangsan@example.com");
        users.setUsers_phone("13800138000");
        userDao = new UserDao();
        int i = userDao.insert(users);
        System.out.println(i);
    }

}
