package com.simple.simpledemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simple.simpledemo.entity.UserInfo;
import com.simple.simpledemo.exception.CustomMessageException;
import com.simple.simpledemo.mapper.UserInfoMapper;
import com.simple.simpledemo.param.UserInfoParam;
import com.simple.simpledemo.param.UserQueryParam;
import com.simple.simpledemo.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author lizhou
 * @since 2022-11-15
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public PageInfo<UserInfo> userInfoList(UserQueryParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());


        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(!ObjectUtils.isEmpty(param.getAccount()), UserInfo::getAccount, param.getAccount());
        queryWrapper.lambda().eq(!ObjectUtils.isEmpty(param.getName()), UserInfo::getName, param.getName());
        queryWrapper.lambda().eq(!ObjectUtils.isEmpty(param.getSex()), UserInfo::getSex, param.getSex());
        return new PageInfo<>(userInfoMapper.selectList(queryWrapper));
    }


    @Override
    public UserInfo getUserInfo(Long id) {
        return this.baseMapper.selectById(id);
    }

    @Override
    public void saveUser(UserInfoParam userInfoParam) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoParam, userInfo);
        if (ObjectUtils.isEmpty(userInfo.getId())) {
            this.save(userInfo);
        }else {
            this.updateById(userInfo);
        }
    }


    @Override
    public void delUser(Long id) {
        this.removeById(id);
    }
}
