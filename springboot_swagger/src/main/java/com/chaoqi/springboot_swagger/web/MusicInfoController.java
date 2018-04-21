package com.chaoqi.springboot_swagger.web;

import com.chaoqi.springboot_swagger.dao.domain.MusicInfo;
import com.chaoqi.springboot_swagger.service.MusicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/music")
@Api(tags = "MusicInfo")
public class MusicInfoController {

    @Autowired
    private MusicInfoService musicInfoService;

    @ApiOperation(value = "根据Id获取歌手信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", dataType = "Long"),
    })
    @RequestMapping(value = "/showMusic", method = RequestMethod.GET)
    public List<MusicInfo> getMusicInfo(@RequestParam(name = "id", required = false) Long id) {
        List<MusicInfo> musicInfo1 = musicInfoService.getMusicInfo(id);
        return musicInfo1;
    }

    @ApiOperation(value = "根据Id删除歌手信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", dataType = "Long")
    @RequestMapping(value = "/deleteMusic", method = RequestMethod.DELETE)
    public Long deleteUser(@RequestParam(name = "id", required = false) Long id) {
        Long sum = musicInfoService.getDeleteId(id);
        return sum;
    }
}
