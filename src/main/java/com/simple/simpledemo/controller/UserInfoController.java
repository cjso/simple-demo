package com.simple.simpledemo.controller;


import com.github.pagehelper.PageInfo;
import com.simple.simpledemo.annotations.IgnoreResponseWrapper;
import com.simple.simpledemo.entity.UserInfo;
import com.simple.simpledemo.param.UserInfoParam;
import com.simple.simpledemo.param.UserQueryParam;
import com.simple.simpledemo.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author lizhou
 * @since 2022-11-15
 */
@RestController
@Api(tags = "用户信息", value = "用户信息管理")
@ApiOperation(value = "管理用户信息：实现列表数据增删查改", notes = "用户列表信息的维护：增删查改")
@RequestMapping("/project")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    /**
     * 查询菜单列表
     *
     */
    @ResponseBody
    @RequestMapping(value = "/getUserInfoList", method = RequestMethod.GET)
    @ApiOperation("用户列表查询")
    public PageInfo<UserInfo> getUserInfoList(UserQueryParam userQueryParam) {
        return userInfoService.userInfoList(userQueryParam);
    }

    @ResponseBody
    @GetMapping("/getUserInfo")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "long", paramType = "query")
    public UserInfo getUserInfo(Long id) {
        return userInfoService.getUserInfo(id);
    }

    @ResponseBody
    @PostMapping("/saveUser")
    @ApiOperation("保存用户信息")
    public void saveUser(@RequestBody UserInfoParam userInfo) {
        userInfoService.saveUser(userInfo);
    }


    @ResponseBody
    @DeleteMapping("/delUser")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "long", paramType = "query")
    public void delUser(Long id) {
        userInfoService.delUser(id);
    }


    @ResponseBody
    @IgnoreResponseWrapper
    @GetMapping("/getUserInfoIgnore")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "long", paramType = "query")
    public UserInfo getUserInfoIgnore(Long id) {
        return userInfoService.getUserInfo(id);
    }



}
