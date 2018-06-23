package com.chaoqi.springboot_datasource.service.impl;

import com.chaoqi.springboot_datasource.config.TargetDataSource;
import com.chaoqi.springboot_datasource.dao.domain.UserLongin;
import com.chaoqi.springboot_datasource.dao.mapper.DataSourceMapper;
import com.chaoqi.springboot_datasource.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSourceServiceImpl implements DataSourceService {

    @Autowired
    private DataSourceMapper dataSourceDao;

    @Override
    public List<UserLongin> selectById(Long id) {
        List<UserLongin> list = dataSourceDao.selectById(id);
        return list;
    }

    @Override
    @TargetDataSource(name = "ds1")
    public List<UserLongin> selectAllDs1() {
        List<UserLongin> list = dataSourceDao.selectAllDs1();
        return list;
    }

    @Override
    @TargetDataSource(name = "ds2")
    public List<UserLongin> selectAllDs2() {
        List<UserLongin> list = dataSourceDao.selectAllDs2();
        return list;
    }
}
