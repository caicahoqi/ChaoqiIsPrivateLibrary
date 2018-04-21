package com.chaoqi.springboot_shiro_redis.service;

import com.chaoqi.springboot_shiro_redis.dao.domain.SysResources;

import java.util.List;

public interface ResourcesService {
    List<SysResources> selectAll();
}
