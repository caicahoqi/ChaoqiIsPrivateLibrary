package com.chaoqi.springboot_datasource.config;

import java.lang.annotation.*;

/**
 * @Author caiChaoqi
 * @Date 2018-06-23
 * @Description 作用于类、接口或者方法上
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    String name();
}
