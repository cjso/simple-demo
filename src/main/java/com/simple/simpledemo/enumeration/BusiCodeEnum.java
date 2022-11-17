package com.simple.simpledemo.enumeration;

/**
 * @author liuguofu
 * @date 2017/4/28
 */
public enum BusiCodeEnum {

    //4XX 权限编码
    SUCCESS(20000, "请求成功"),
    NON_AUTHORIZATION(401, "登录认证失败"),
    SERVER_ERROR(402, "服务器异常"),
    SERVICE_BUSY(403,"服务器繁忙,请稍后再试"),
    BUSINESS_BUSY(404,"操作过于频繁，请休息一下"),
    H5_LOGIN_CODE_ILLEGAL(405,"网页登录授权码不正确"),
    H5_LOGIN_TOKEN_ERROR(406,"网页登录token错误"),
    ACCOUNT_BLOCK(407,"该用户存在违规操作，暂被封禁"),
    ILLEGAL_OPERATE(408,"非法操作或没有权限"),
    PARAM_ERROR(414,"参数错误"),


    ;

    private final int value;

    private final String reasonPhrase;

    BusiCodeEnum(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
