package com.simple.simpledemo.vo;

import com.simple.simpledemo.enumeration.BusiCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

import static com.simple.simpledemo.enumeration.BusiCodeEnum.SERVICE_BUSY;
import static com.simple.simpledemo.enumeration.BusiCodeEnum.SUCCESS;


/**
 * @author PaperCut
 */
@Data
@ApiModel("基础返回对象")
public class BaseResponseVO<T> {

    /**
     * 是否成功
     */
    @ApiModelProperty("是否成功")
    private Boolean success;

    /**
     * 响应状态码
     */
    @ApiModelProperty("响应状态码")
    private Integer code;

    /**
     * 响应消息
     */
    @ApiModelProperty("响应消息")
    private String message;

    /**
     * 响应数据
     */
    @ApiModelProperty("响应数据")
    private T data;

    /**
     * 响应时间
     */
    @ApiModelProperty("接口返回时间")
    private Date timestamp;

    public BaseResponseVO() {
        this(SUCCESS.value(), SUCCESS.getReasonPhrase(), null);
    }

    public BaseResponseVO(T data) {
        this(SUCCESS.value(), SUCCESS.getReasonPhrase(), data);
    }

    public BaseResponseVO(BusiCodeEnum status) {
        this(status.value(), status.getReasonPhrase(), null);
    }

    public BaseResponseVO(Integer code, String message) {
        this(code, message, null);
    }

    /**
     * 添加返回信息覆盖默认提示
     *
     * @param status  状态码
     * @param message 覆盖默认信息的提示
     * @param data    数据 T
     */
    public BaseResponseVO(BusiCodeEnum status, String message, T data) {
        this(status.value(), message, data);
    }

    public BaseResponseVO(BusiCodeEnum status, T data) {
        this(status.value(), status.getReasonPhrase(), data);
    }

    public BaseResponseVO(Integer code, String message, T data) {
        this.success = Objects.nonNull(code) && code == SUCCESS.value();
        this.code = Objects.nonNull(code) ? code : SERVICE_BUSY.value();
        this.message = message;
        this.data = data;
        this.timestamp = new Date();
    }
}
