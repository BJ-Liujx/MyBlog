package com.liujx.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName LogConfig
 * @Description: TODO
 * @Author 刘金鑫
 * @Date 2020/1/19
 * @Version V1.0
 **/
@Configuration
public class LogTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

    @Bean
    public UtilsTest test(){
        LOGGER.info("==========print log==========");
        return new UtilsTest();
    }
}
