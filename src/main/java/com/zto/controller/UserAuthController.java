package com.zto.controller;


import com.zto.entity.ClassifyInfo;
import com.zto.entity.UserInfo;
import com.zto.service.ClassifyInfoService;
import com.zto.service.UserInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserAuthController {

    @Resource
    private UserInfoService userInfoService;


    @PostMapping("/auth")
    public String userAuth(UserInfo userInfo) {
        String result =userInfoService.userAuth(userInfo);

        return result;
    }




}
