package com.HiSmartHome.service;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Users;

import java.util.List;

public class RegisterService {
    public int register(Users user) {
        UserDao userDao = new UserDao();

        return userDao.usersadd(user);
    }
}
