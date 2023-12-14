package com.HiSmartHome.service;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Users;

import java.util.List;

public class UserService {
    UserDao user = new UserDao();
    public List<Users> findAlluser(){
        return user.findAll();
    }
}
