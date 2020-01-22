package com.liujx.common.constant;

/**
 * @ClassName: ResultEnum
 * @Auther: 刘金鑫
 * @Date: 2020/1/22 13:25
 * @Version: 1.0
 * @Description: 返回值状态码枚举类
 */
public enum ResultEnum {

    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "我猜你可能还在上小学"),
    MIDDLE_SCHOOL(101, "你可能在上初中");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
