package com.chenweicheng.springbootmall.service;

import com.chenweicheng.springbootmall.dto.UserRegisterRequest;
import com.chenweicheng.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
