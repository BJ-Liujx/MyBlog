package com.liujx.controller;

import com.liujx.service.Servicetest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: Controllertest
 * @Auther: 刘金鑫
 * @Date: 2020/1/19 14:08
 * @Version: 1.0
 * @Description:
 */
@RestController
@RequestMapping("test")
public class Controllertest {

    Servicetest servicetest = new Servicetest();
    @RequestMapping("show")
    public String conttest (){
        return servicetest.serivcetest()+"我是controller";
    }
}
