package com.chaoqi.dao.mapper;

import com.chaoqi.entity.UserLogin;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserLoginMapper {

    @ResultMap("BaseResultMap")
    @Select("select * from user_login")
    List<UserLogin> selectAll();

}
