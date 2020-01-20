package com.liujx.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: LogConfig
 * @Auther: 刘金鑫
 * @Date: 2020/1/19 16:29
 * @Version: 1.0
 * @Description:
 */
@Configuration
public class LogConfig {

    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);
    @Bean
    public UtilsTest logMethod(){
        LOG.info("==========print log==========");
        return new UtilsTest();
    }
}
