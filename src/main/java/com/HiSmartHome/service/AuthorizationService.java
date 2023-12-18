package com.HiSmartHome.service;

import com.HiSmartHome.dao.AuthorizationDao;

import com.HiSmartHome.model.Authorization;

import java.util.List;

public class AuthorizationService {
    AuthorizationDao authorizationDao=new AuthorizationDao();
    public List<Authorization> getAllAuthorizationService() {
        return authorizationDao.authorization_findAll();
    }

    public Authorization getAuthorizationByIdService(int id) {
        return AuthorizationDao.findAuthorizationById(id);
    }

    public int addAuthorizationService(Authorization authorization) {
        return authorizationDao.authorization_add(authorization);
    }

    public int updateAuthorizationService(Authorization authorization) {
        return authorizationDao.authorization_update(authorization);
    }

    public int deleteAuthorizationService(int id) {
        return authorizationDao.authorization_delete(id);
    }
}
