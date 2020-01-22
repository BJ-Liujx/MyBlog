package com.liujx.entity.system;

import lombok.Data;

/**
 * @ClassName: Resp
 * @Auther: 刘金鑫
 * @Date: 2020/1/22 13:04
 * @Version: 1.0
 * @Description: 自定义返回对象
 */
@Data
public class Result<T> {

    /**返回消息*/
    private String message;
    /**返回状态码*/
    private Integer code;
    /**返回数据*/
    private T data;
}
