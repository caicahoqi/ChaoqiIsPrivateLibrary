package com.chaoqi.springboot_test.service.impl;

import com.chaoqi.springboot_test.dao.domain.MusicInfo;
import com.chaoqi.springboot_test.dao.mapper.MusicInfoMapper;
import com.chaoqi.springboot_test.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl  implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo) {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll(null);
        return musicInfos;
    }
}
