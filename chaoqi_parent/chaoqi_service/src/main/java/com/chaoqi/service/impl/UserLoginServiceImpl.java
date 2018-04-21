package com.chaoqi.service.impl;

import com.chaoqi.dao.mapper.UserLoginMapper;
import com.chaoqi.entity.UserLogin;
import com.chaoqi.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public List<UserLogin> getVideoInfo(UserLogin userLogin) {
        return userLoginMapper.selectAll();
    }
}
