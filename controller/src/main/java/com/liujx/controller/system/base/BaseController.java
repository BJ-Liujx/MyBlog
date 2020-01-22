package com.liujx.controller.system.base;

import com.liujx.controller.system.exception.CustomizeException;
import com.liujx.entity.system.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: BaseController
 * @Auther: 刘金鑫
 * @Date: 2020/1/22 12:51
 * @Version: 1.0
 * @Description: controller父类
 */
@Slf4j
@ControllerAdvice
public class BaseController {

    public Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public Result success() {
        return success(null);
    }

    public Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof CustomizeException) {   //判断异常是否是我们定义的异常
            CustomizeException customizeException = (CustomizeException) e;
            return error(customizeException.getCode(), customizeException.getMessage());
        }else {
            log.error("【系统异常】{}", e);
            return error(-1, "未知错误");
        }
    }

}
