package com.chaoqi.springboot_datasource.controller;

import com.chaoqi.springboot_datasource.dao.domain.UserLongin;
import com.chaoqi.springboot_datasource.service.DataSourceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author caiChaoqi
 * @Date 2018-06-23
 */
@RestController
public class DataSourceController {

    private Logger logger = Logger.getLogger(DataSourceController.class);

    @Autowired
    private DataSourceService dataSourceService;

    @GetMapping("/default/{id}")
    public List<UserLongin> useDefaultDataSource(@PathVariable("id") Long id) {
        logger.info("使用默认数据源");
        List<UserLongin> list = dataSourceService.selectById(id);
        return list;
    }

    @GetMapping("/ds1")
    public List<UserLongin> useDS1DataSource() {
        logger.info("使用ds1数据源");
        List<UserLongin> list = dataSourceService.selectAllDs1();
        return list;
    }

    @GetMapping("/ds2")
    public List<UserLongin> useDS2DataSource() {
        logger.info("使用ds2数据源");
        StringBuilder stringBuilder = new StringBuilder();
        List<UserLongin> list = dataSourceService.selectAllDs2();
        return list;
    }
}
