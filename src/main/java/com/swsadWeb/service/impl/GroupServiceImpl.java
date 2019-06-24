package com.swsadWeb.service.impl;

import com.swsadWeb.dao.GroupDao;
import com.swsadWeb.entity.Group;
import com.swsadWeb.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao groupDao;

    @Override
    public void insertGroup(Group group) {
        groupDao.insertGroup(group);
    }

    @Override
    public void updateByGroupId(Group group) {
        groupDao.updateByGroupId(group);
    }


    //can use pagehelper
    @Override
    public List<Group> findByName(String name) {
        return groupDao.findByName(name);
    }
}
