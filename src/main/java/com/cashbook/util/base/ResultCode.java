package com.cashbook.util.base;

/**
 * Created by aden on 2017/12/22.
 */
public enum ResultCode {
    SUCCESS("成功", "200"),
    TIME_OUT("登录过期，请重新登录", "1"),
    FAIL("失败", "-1"),
    CODE_ERROR("验证码错误","-2"),
    USER_NOT_EXIST("用户不存在","-3"),
    PASSWORD_DIFF("两次密码输入不一致","-4"),
    PASSWORD_ERROR("手机号或密码输入不正确","-5"),
    DEVICE_BINDED("设备已绑定","-6"),
    PASSWORD_SAME("新密码和旧密码不能相同","-7"),
    USER_MP_BINDED("此用户已绑定微信","-9"),
    USER_MP_UNBINDED("此用户未绑定微信","9"),
    USER_PASSWORD_UNSET("用户已注册,未设置密码","-10"),
    USER_PASSWORD_SET("用户已注册,已设置密码","10"),
    USER_REGISTERED("用户已注册","3"),
    CODE_EXPIRED("验证码已过期","4"),
    USER_NOT_BIND("公众号未与用户账号绑定！","5"),
    BAD_REQUEST("不合法的请求！","6"),
    USER_NOT_FOLLOW("此用户没有关注该公众号！","7"),
    MP_USER_DB_SAME("关注用户与后台数据库记录的关注用户一致", "8"),
    MP_USER_DB_DIFF("关注用户与后台数据库记录的关注用户不一致", "-8"),
    TOKEN_NULL("此用户token不存在或者已过期","10"),
    HEADER_NO_USERID("header中必须传入用户ID","11"),
    HEADER_USERID_ERROR("传入app用户id和token中对应id不一致","12");
    private String msg ;
    private String code ;

    private ResultCode(String msg , String code ){
        this.msg = msg ;
        this.code = code ;
    }
    // 获取msg
    public static  String StringMsg(String code){
        for (ResultCode resultCode: ResultCode.values()){
            if (resultCode.getCode() == code){
                return resultCode.msg;
            }
        }
        return null;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
