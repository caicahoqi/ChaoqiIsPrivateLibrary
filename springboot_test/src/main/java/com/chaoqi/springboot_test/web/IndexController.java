package com.chaoqi.springboot_test.web;

import com.chaoqi.springboot_test.dao.domain.MusicInfo;
import com.chaoqi.springboot_test.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    private static final String INDEX = "index";
    @Autowired
    private MusicInfoService musicInfoService;

    @RequestMapping("/show")
    public String getIndex() {
        return INDEX;
    }

    @RequestMapping("/music")
    @ResponseBody
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo) {
        List<MusicInfo> musicInfoList = musicInfoService.getMusicInfo(null);
        return musicInfoList;
    }
}
