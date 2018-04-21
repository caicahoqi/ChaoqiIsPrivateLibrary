
package com.chaoqi.controller;

import com.chaoqi.entity.UserLogin;
import com.chaoqi.service.UserLoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {
    private static Logger log = Logger.getLogger(TestController.class);
    private static final String HELLO = "hello";
    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/test")
    public String test() {
        return HELLO;
    }

    @ResponseBody
    @RequestMapping("/getUserLogin")
    public List<UserLogin> getViideType() {
        List<UserLogin> userLogin = userLoginService.getVideoInfo(null);
        for (UserLogin userLogins : userLogin) {
            log.info(userLogins.toString());
        }
        return userLogin;
    }
}
