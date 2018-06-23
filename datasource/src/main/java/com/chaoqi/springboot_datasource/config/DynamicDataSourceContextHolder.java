package com.chaoqi.springboot_datasource.config;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author caiChaoqi
 * @Date 2018-06-23
 * @Description 动态数据源上下文管理
 */
public class DynamicDataSourceContextHolder {

    private Logger logger = Logger.getLogger(DynamicDataSourceContextHolder.class);
    //存放当前线程使用的数据源类型信息
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    //存放数据源id
    public static List<String> dataSourceIds = new ArrayList<String>();

    //设置数据源
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    //获取数据源
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    //清除数据源
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    //判断当前数据源是否存在
    public static boolean isContainsDataSource(String dataSourceId) {
        return dataSourceIds.contains(dataSourceId);
    }
}
