package com.chenweicheng.springbootmall.service.impl;

import com.chenweicheng.springbootmall.dao.UserDao;
import com.chenweicheng.springbootmall.dto.UserRegisterRequest;
import com.chenweicheng.springbootmall.model.User;
import com.chenweicheng.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
