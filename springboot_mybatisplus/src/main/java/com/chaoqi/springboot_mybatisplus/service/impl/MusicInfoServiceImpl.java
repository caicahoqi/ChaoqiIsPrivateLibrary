package com.chaoqi.springboot_mybatisplus.service.impl;

import com.chaoqi.springboot_mybatisplus.dao.domain.MusicInfo;
import com.chaoqi.springboot_mybatisplus.dao.mapper.MusicInfoMapper;
import com.chaoqi.springboot_mybatisplus.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo() {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll();
        return musicInfos;
    }
}
