package com.chaoqi.springboot_shiro_redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chaoqi.springboot_shiro_redis.dao.mapper")
public class SpringbootShiroRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootShiroRedisApplication.class, args);
	}
}
