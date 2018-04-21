package com.chaoqi.springboot_mybatisplus.web;

import com.chaoqi.springboot_mybatisplus.dao.domain.MusicInfo;
import com.chaoqi.springboot_mybatisplus.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/music")
public class MusicInfoController {

    @Autowired
    private MusicInfoService musicInfoService;

    @RequestMapping("/showMusic")
    public List<MusicInfo> getMusicInfo() {
        List<MusicInfo> musicInfo1 = musicInfoService.getMusicInfo();
        return musicInfo1;
    }

}
