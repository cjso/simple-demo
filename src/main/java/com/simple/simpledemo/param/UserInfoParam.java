package com.simple.simpledemo.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author lizhou
 * @since 2022-11-15
 */
@Data
public class UserInfoParam {


    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "性别（0--未知1--男2--女）")
    private Integer sex;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

}
