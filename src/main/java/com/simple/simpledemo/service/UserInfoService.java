package com.simple.simpledemo.service;

import com.github.pagehelper.PageInfo;
import com.simple.simpledemo.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.simple.simpledemo.param.UserInfoParam;
import com.simple.simpledemo.param.UserQueryParam;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author lizhou
 * @since 2022-11-15
 */
public interface UserInfoService extends IService<UserInfo> {

    PageInfo<UserInfo> userInfoList(UserQueryParam param);


    UserInfo getUserInfo(Long id);


    void saveUser(UserInfoParam userInfo);

    void delUser(Long id);

}
