package com.liujx.entity;

import com.liujx.common.CommonTest;
import com.liujx.utils.UtilsTest;

/**
 * @ClassName: EntityTest
 * @Auther: 刘金鑫
 * @Date: 2020/1/19 14:02
 * @Version: 1.0
 * @Description:
 */
public class EntityTest {

    public String entityTest(){
        CommonTest commonTest = new CommonTest();
        UtilsTest utilsTest = new UtilsTest();
        return commonTest.commtest()+utilsTest.utilstest()+"我是entity";
    }
}
