package com.chenweicheng.springbootmall.dao;

import com.chenweicheng.springbootmall.dto.UserRegisterRequest;
import com.chenweicheng.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
