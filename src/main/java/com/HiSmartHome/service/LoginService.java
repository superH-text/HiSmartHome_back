package com.HiSmartHome.service;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Users;

import java.util.List;

public class LoginService {
    UserDao userDao = new UserDao();

    public Users login(String username, String password){
        return userDao.Login(username,password);
    }

}
