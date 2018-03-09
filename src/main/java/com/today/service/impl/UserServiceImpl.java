package com.today.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.today.dao.UserMapper;
import com.today.service.UserService;
import com.today.vo.User;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userDao;
    
    @Override
    public User getUserById(int uid) {
        return this.userDao.selectByPrimaryKey(uid);
    }

}
