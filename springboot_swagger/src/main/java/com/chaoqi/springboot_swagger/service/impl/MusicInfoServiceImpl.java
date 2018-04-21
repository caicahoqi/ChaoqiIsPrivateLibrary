package com.chaoqi.springboot_swagger.service.impl;

import com.chaoqi.springboot_swagger.dao.domain.MusicInfo;
import com.chaoqi.springboot_swagger.dao.mapper.MusicInfoMapper;
import com.chaoqi.springboot_swagger.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl  implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo(Long id) {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll(id);
        return musicInfos;
    }

    @Override
    public Long getDeleteId(Long id) {
        Long sum = musicInfoMapper.deleteId(id);
        return sum;
    }
}
