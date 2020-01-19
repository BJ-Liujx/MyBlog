package com.liujx.service;

import com.liujx.mapper.MapperTest;

/**
 * @ClassName: Servicetest
 * @Auther: 刘金鑫
 * @Date: 2020/1/19 14:07
 * @Version: 1.0
 * @Description:
 */
public class Servicetest {

    MapperTest mapperTest = new MapperTest();
    public String serivcetest(){
        return mapperTest.mappertest()+"我是service";
    }
}
