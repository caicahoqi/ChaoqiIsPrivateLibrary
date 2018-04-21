package com.chaoqi.springboot_test.service;


import com.chaoqi.springboot_test.dao.domain.MusicInfo;

import java.util.List;

public interface MusicInfoService {

    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo);
}
