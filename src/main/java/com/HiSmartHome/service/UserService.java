package com.HiSmartHome.service;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Devices;
import com.HiSmartHome.model.Users;

import java.util.List;

public class UserService {
    UserDao userdao = new UserDao();
    public List<Users> getAllUsersService() {
        return userdao.findAll();
    }

    public Users getUsersByIdService(int id) {
        return userdao.findUserByid(id);
    }

    public int addUsersService(Users users) {
        return userdao.usersadd(users);
    }

    public int updateUsersService(Users users) {
        return userdao.updateUser(users);
    }

    public int deleteUsersService(int id) {
        return userdao.delUserByid(id);
    }
}
