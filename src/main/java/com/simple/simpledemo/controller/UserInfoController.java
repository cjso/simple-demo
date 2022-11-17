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
@RestController
@RequestMapping("/dev-api/api/user-info")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    /**
     * 查询菜单列表
     *
     */
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getUserInfoList")
    public BaseResponseVO<PageInfo<UserInfo>> getUserInfoList(UserQueryParam userQueryParam) {
        return new BaseResponseVO<>(BusiCodeEnum.SUCCESS, userInfoService.userInfoList(userQueryParam));
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getUserInfo")
    public BaseResponseVO<UserInfo> getUserInfo(Long id) {
        return new BaseResponseVO<>(BusiCodeEnum.SUCCESS, userInfoService.getUserInfo(id));
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/saveUser")
    public BaseResponseVO saveUser(@RequestBody UserInfoParam userInfo) {
        userInfoService.saveUser(userInfo);
        return new BaseResponseVO<>(BusiCodeEnum.SUCCESS);
    }


    @CrossOrigin
    @ResponseBody
    @RequestMapping("/delUser")
    public BaseResponseVO delUser(Long id) {
        userInfoService.delUser(id);
        return new BaseResponseVO<>(BusiCodeEnum.SUCCESS);
    }



}
