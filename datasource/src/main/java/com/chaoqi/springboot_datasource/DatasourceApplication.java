package com.chaoqi.springboot_datasource;

import com.chaoqi.springboot_datasource.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.chaoqi.springboot_datasource.dao.mapper")
@Import(DynamicDataSourceRegister.class)
public class DatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatasourceApplication.class, args);
    }
}
