package com.HiSmartHome.service;

import com.HiSmartHome.dao.CommunityDao;
import com.HiSmartHome.model.Community;
import com.HiSmartHome.model.Devices;

import java.util.List;

public class CommunityService {
    CommunityDao communityDao=new CommunityDao();
    public List<Community> getAllCommunityService() {
        return communityDao.community_findAll();
    }

    public Community getCommunityByIdService(int id) {
        return communityDao.findCommunityById(id);
    }

    public int addCommunityService(Community community) {
        return communityDao.community_add(community);
    }

    public int updateCommunityService(Community community) {
        return communityDao.community_update(community);
    }

    public int deleteCommunityService(int id) {
        return communityDao.community_delete(id);
    }
}
