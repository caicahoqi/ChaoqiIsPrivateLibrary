package com.chaoqi.springboot_swagger.dao.mapper;


import com.chaoqi.springboot_swagger.dao.domain.MusicInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MusicInfoMapper {

    @ResultMap("BaseResultMap")
    @Select("select * from music_info WHERE id= #{id}")
    List<MusicInfo> selectAll(@Param("id") Long id);

    @ResultMap("BaseResultMap")
    @Select("DELETE FROM music_info WHERE id= #{id}")
    Long deleteId(@Param("id") Long id);
}