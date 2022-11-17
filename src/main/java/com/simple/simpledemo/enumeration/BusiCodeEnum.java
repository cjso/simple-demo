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


    //5XXX oauth业务码
    PHONE_HAS_RESISTER(5001, "手机号已注册,请直接登录"),
    PASSWORD_ERROR(5002, "密码错误"),
    PASSWORD_EMPTY(5003,"密码不能为空"),
    PASSWORD_ILLEGAL(5004,"密码为非法字符"),
    REGISTER_ERROR(5005, "注册失败"),
    ACCOUNT_IS_ILLEGAL(5006, "用户账号异常"),
    REGISTER_FREQUENTLY(5208, "注册过于频繁"),
    ACCOUNT_NOT_EXIST(5209,"账号不存在"),

    //6XXX api接口业务码
    //用户错误码
    USER_NOT_EXIST(6101, "用户不存在"),
    ADD_GOLD_FAIL(6102, "增加金币失败"),
    ADD_DIAMOND_FAIL(6103, "增加钻石失败"),
    GOLD_NOT_ENOUGH(6104, "金币不足，请先充值"),
    DIAMOND_NOT_ENOUGH(6105, "钻石余额不足"),
    USER_GENDER_ERROR(6106,"获取用户性别失败"),
    USER_NICK_EXIST(6107, "昵称已存在，请修改"),
    USER_NICK_FORBID(6108,"用户昵称包含违规字符"),
    PHOTO_LESS_LIMIT(6110,"上传图片数量不能小于一张"),
    CODE_NOT_CORRECT(6112,"请输入正确的邀请码"),
    CODE_APPLY_SUCCESS(200,"邀请码申请成功，我们将尽快短信通知您"),
    GET_LOCATION_FAIL(6115,"获取用户当前地理位置失败"),
    PHOTO_NOT_EXIST(6116,"图片不存在"),
    GENERATOR_CODE_ERROR(6117,"生成邀请码失败"),
    CANNOT_EVALUATE_SELF(6118,"不能评价自己"),
    ALREADY_EVALUATED(6119,"不能重复评价"),
    GET_CITY_FAILED(6120,"定位用户所在城市失败"),
    INVITE_CODE_FREQUENTLY(6121,"邀请码申请过于频繁"),
    NOT_RED_PIC(6122,"不是付费图片"),
    CHANNEL_EXIST(6123,"渠道已存在"),
    MY_CHAT_PRIVILEGE(6124,"TA还未解锁您的联系方式及交流，无法评价"),
    OTHER_CHAT_PRIVILEGE(6124,"您还未解锁TA的联系方式及交流，无法评价"),
    BLACK_LIST_EXIST(6125,"用户已经被拉黑"),
    BLACK_USER_FAIL(6126,"加入黑名单失败"),
    CANCEL_BLACK_USER_FAIL(6127,"取消黑名单失败"),
    EVALUATION_SUCCESS(200,"评价成功"),
    ALREADY_IMPEACH(6128,"您已举报过该用户,请耐心等待平台审核结果"),
    FACE_MATCH_LIMIT(6129,"已超过最大可认证次数限制"),
    ALREADY_LIKE_PYQ(6130,"不可重复点赞"),
    PYQ_PHOTO_TEXT_NULL(6131,"图片和文字不可都为空"),

    // 送礼错误码
    GIFT_NOT_EXSISTS(6150,"礼物不存在"),

    //充值错误码
    CHARGE_PROD_NOT_EXIST(6201,"充值产品无效"),
    PAY_CHANNEL_NOT_EXIST(6203,"支付渠道不存在"),
    CHARGE_RECORD_NOT_EXIST(6204,"充值记录不存在"),
    DUPLICATE_TRANSFER_REQUEST(6205, "重复转账请求"),
    CHARGE_AMOUNT_ERROR(6206, "订单金额异常"),
    CHARGE_APP_ERROR(6207, "订单商户异常"),
    ALIPAY_ACCOUNT_ERROR(6208, "请先绑定支付宝账号"),
    WITHDRAW_SUCCESS(200,"提现申请已提交，请耐心等待"),
    HAS_PRIVILEGE(6210,"已拥有权限,不需要重复付款"),
    PAY_CALLBACK_SIGN_ERROR(6211,"支付回调签名校验失败"),
    REPEAT_CALLBACK(6212,"重复回调请求"),
    WX_APP_ID_ERROR(6213,"微信appId错误"),
    WX_MUCH_ID_ERROR(6214,"微信商户号错误"),
    CHARGE_STATUS_ERROR(6215,"订单状态异常"),
    JOINPAY_MUCH_ID_ERROR(6214,"汇聚商户号错误"),
    APPLE_PAY_FAILED(6215,"applePay支付是失败"),
    APPLE_PAY_TRADE_NUM_ERROR(6215,"applePay订单号错误"),
    ORDER_BOOKING(6214,"当前正在入账中,请稍后再操作"),
    DUPLICATE_AUDIO(6215,"重复的语音通话消息"),
    VIP_PROD_NOT_EXIST(6216,"购买的vip产品无效"),
    UNKNOW_PAY_PROD_TYPE(6217,"无效的支付产品"),
    NOT_VIDEO_APP_VERSION(6218,"对方应用版本不支持视频聊天"),
    HAS_FIRST_CHARGE(6219,"已使用过优惠首充"),

    //版本更新错误码
    LATEST_VERSION_NOT_EXIST(6301,"请配置最新的app版本"),

    //7XXX 活动业务码
    EXCEED_RATE_LIMIT(7001, "点击太快啦，休息下啦"),

    //8XX 短信业务码
    VERIFY_CODE_ERROR(8001, "短信验证码错误"),
    SMS_NOT_EXPIRED(8002, "验证码未过期,请等一分钟后再试"),
    SMS_SENDING_FREQUENCY(8003, "获取短信过于频繁，请稍后再试"),
    SMS_SEND_ERROR(8004, "短信发送失败"),
    PHONE_INVALID(8005, "请输入正确的手机号码"),
    SMS_SEND_SUCCESS(200,"短信验证码已成功发送至您的手机"),

    //9XXX 管理后台业务码
    PARAM_ILLEGAL(9001, "参数非法"),
    WITHDRAW_NOT_EXIST(9002,"提现记录不存在"),
    WITHDRAW_APPROVED(9003,"存在已经审批的提现记录"),
    ILLEGAL_TRANSFER_REQUEST(9004,"非法转账请求"),
    TRANSFER_COMPLETED(9005,"已进行过转账"),
    TRANSFER_SCHEDULING(9006,"转账正在进行中,请不要重复转账"),
    ADMIN_USER_ERROR(9007,"账号不存在"),
    ADMIN_PASSWORD_ERROR(9008,"密码错误"),
    NOT_BIND_PHONE(9009,"用户没有绑定手机号码"),
    ADMIN_CODE_ERROR(9010,"验证码错误"),
    RECORD_NOT_EXIST(9011,"记录不存在"),
    RECORD_ALREADY_EXIST(9012,"记录已存在"),
    WITHDRAW_STATUS_ERROR(9013,"提现状态异常"),
    OPERATE_FAILED(9014,"操作失败"),

    NON_VIP(9015,"当前未开通VIP会员"),
    EVERYDAY_COUNT_RUNOUT(9016,"当天次数已用完"),

    PYQ_ALREADY_DELETE(9017,"动态已被删除"),
    PYQ_ALREADY_FAIL(9018,"该动态违规暂不可访问"),

    NO_REACH_WITHDRAW_THRESHOLD(9019,"未达到提现门槛，不能进行提现"),


    HAS_SENSITIVE(9020, "当前内容不符合规范，请修改后重试哦~"),
    NEED_REAL_PERSON_APPROVE(9021, "需要完成真人认证哦~"),
    ZEGO_TOKEN_ERR(9022, "会话token生成失败!"),
    ZEGO_CALLBACK_SIGNATURE_ERR(9023, "签名校验失败!"),
    CALL_CHECK_NO_PASS(9024, "只能和异性发起通话哦~"),
    CALL_END_ERR(9024, "上一次通话未能成功结束，发起失败!"),
    TARGET_USER_CALLING(9024, "对方通话中请稍候再试哦~"),
    GET_ZEGO_INIT_INFO_ERR(9024, "初始信息获取失败!"),
    CALL_INFO_GET_ERR(9025, "未获取到对应通话信息!"),
    DEVICE_INFO_GET_ERR(9026, "未获取到对应设备信息!"),
    DEVICE_ID_GET_ERR(9026, "未获取到设备号信息!"),
    INVITE_CODE_DEVICE_DUPLICATED(9027, "该设备已填写过邀请码"),
    CHAT_SEND_FAIL(9028, "私聊发送失败!"),
    VERSION_TOO_LOW(9029, "当前版本过低，请升级最新版本!"),
    ADMIN_PHONE_NO_BIND(9030, "您未绑定手机号，请联系管理员"),
    USERNOTEXISTS(9031, "账号不存在"),
    SMSCODEERROR(9032, "短信验证码错误，请重新输入！"),
    ALERT_PARAMETER_ILLEGAL(9033,"必填参数为空"),
    SMS_NOT_EXPIRED3(2001, "已发送了验证码短信.请等3分钟后再试"),
    SMS_SENDING_FREQUENCY_TOO_HIGH(200390, "短信发送频率过高，请稍后再试"),
    APP_VERSIONTOLOW(200391, "当前版本过低，请前往升级最新版本!"),
    MALE_EDIT_FAST_REPLY_MSG_ERR(200392, "男性用户不能编辑快捷语!"),
    PIC_SENSITIVE(9020, "图片内容不符合规范，请修改后重试哦~"),
    AUDIO_SENSITIVE(9021, "音频内容不符合规范，请修改后重试哦~"),

    TXT_NUM_REACH_LIMIT(9022, "最多添加30条打招呼文字哦"),
    AUDIO_NUM_REACH_LIMIT(9023, "最多添加10条打招呼语音哦"),
    PIC_NUM_REACH_LIMIT(9024, "最多添加10条打招呼图片哦~"),
    COMMON_ERR(9025, "服务器异常"),

    SEND_MSG_TOO_HIGH(9026, "你发消息太多次了,请休息一下吧~"),
    SEND_HI_TOO_HIGH(9027, "你打招呼太多次了,请休息一下吧~"),
    SEND_AUDIO_TOO_HIGH(9028, "你发起语音太多次了,请休息一下吧~"),
    SEND_VIDEO_TOO_HIGH(9029, "你发起视频太多次了,请休息一下吧~"),

    CARD_CONFIG_ERR(9029, "视频卡配置信息获取失败~"),

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
