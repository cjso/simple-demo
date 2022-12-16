package com.simple.simpledemo.mapper;

import com.simple.simpledemo.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author lizhou
 * @since 2022-11-15
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    UserInfo getUserInfoById(Long id);

}
