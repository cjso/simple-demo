package com.simple.simpledemo.controller;


import com.github.pagehelper.PageInfo;
import com.simple.simpledemo.entity.UserInfo;
import com.simple.simpledemo.enumeration.BusiCodeEnum;
import com.simple.simpledemo.param.UserInfoParam;
import com.simple.simpledemo.param.UserQueryParam;
import com.simple.simpledemo.service.UserInfoService;
import com.simple.simpledemo.vo.BaseResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author lizhou
 * @since 2022-11-15
 */
//@CrossOrigin("http://localhost:9528")
@RestController
@RequestMapping("/project")
//@RequestMapping("/dev-api/api/user-info")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    /**
     * 查询菜单列表
     *
     */
    @ResponseBody
    @RequestMapping("/getUserInfoList")
    public PageInfo<UserInfo> getUserInfoList(UserQueryParam userQueryParam) {
        return userInfoService.userInfoList(userQueryParam);
    }

    @ResponseBody
    @RequestMapping("/getUserInfo")
    public UserInfo getUserInfo(Long id) {
        return userInfoService.getUserInfo(id);
    }

    @ResponseBody
    @RequestMapping("/saveUser")
    public void saveUser(@RequestBody UserInfoParam userInfo) {
        userInfoService.saveUser(userInfo);
    }


    @ResponseBody
    @RequestMapping("/delUser")
    public void delUser(Long id) {
        userInfoService.delUser(id);
    }



}
