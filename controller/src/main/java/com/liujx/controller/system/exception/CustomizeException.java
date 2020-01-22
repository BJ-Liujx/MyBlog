package com.liujx.controller.system.exception;

import com.liujx.common.constant.ResultEnum;

/**
 * @ClassName: CustomizeException
 * @Auther: 刘金鑫
 * @Date: 2020/1/22 13:22
 * @Version: 1.0
 * @Description:自定义异常类
 */
public class CustomizeException extends RuntimeException{

    private static final long serialVersionUID = 4098138097570886275L;

    private Integer code;

    public CustomizeException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
