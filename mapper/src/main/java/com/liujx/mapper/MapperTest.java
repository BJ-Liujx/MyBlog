package com.liujx.mapper;

import com.liujx.entity.EntityTest;

/**
 * @ClassName: MapperTest
 * @Auther: 刘金鑫
 * @Date: 2020/1/19 14:04
 * @Version: 1.0
 * @Description:
 */
public class MapperTest {
    EntityTest entityTest = new EntityTest();

    public String mappertest(){
        return entityTest.entityTest()+"我是mapper";
    }
}
