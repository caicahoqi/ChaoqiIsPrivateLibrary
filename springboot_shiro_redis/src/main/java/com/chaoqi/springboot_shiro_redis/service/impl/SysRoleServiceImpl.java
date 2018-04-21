package com.chaoqi.springboot_shiro_redis.service.impl;

import com.chaoqi.springboot_shiro_redis.service.SysRoleService;
import com.chaoqi.springboot_shiro_redis.dao.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public Set<String> findRoleNameByUserId(int userId) {
        return sysRoleMapper.findRoleNameByUserId(userId);
    }
}
