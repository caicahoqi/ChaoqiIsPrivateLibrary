package com.chaoqi.springboot_swagger.service;


import com.chaoqi.springboot_swagger.dao.domain.MusicInfo;

import java.util.List;

public interface MusicInfoService {

    List<MusicInfo> getMusicInfo(Long id);

    Long getDeleteId(Long id);
}
