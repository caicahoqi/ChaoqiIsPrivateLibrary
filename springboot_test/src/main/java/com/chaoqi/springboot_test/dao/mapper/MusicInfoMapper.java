package com.chaoqi.springboot_test.dao.mapper;

import com.chaoqi.springboot_test.dao.domain.MusicInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MusicInfoMapper {

    @ResultMap("BaseResultMap")
    @Select("select * from music_info")
    List<MusicInfo> selectAll(MusicInfo musicInfo);
}
