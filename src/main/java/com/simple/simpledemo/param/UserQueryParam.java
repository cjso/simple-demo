package com.simple.simpledemo.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @USER: chenli
 * @DATE: 2022/3/16 10:37
 * @DESCRIPTION:
 */
@Data
@ApiModel("用户列表查询")
public class UserQueryParam {
    /**
     * 陌生号
     */
    @ApiModelProperty("账号")
    private String account;
    /**
     * 手机号
     */
    @ApiModelProperty("姓名")
    private String name;
    /**
     * 认证状态
     */
    @ApiModelProperty("性别")
    private Integer sex;

    private Integer pageNum = 1;
    private Integer pageSize = 10;
}
