package com.liujx.common.Config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.liujx.common.Interceptor.SqlInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MybatisPlusConfig
 * @Auther: 刘金鑫
 * @Date: 2020/1/20 13:41
 * @Version: 1.0
 * @Description: 配置拦截器
 */
@Configuration
@MapperScan("con.liujx.mapper")
public class MybatisPlusConfig {
    /**
     * sql拦截器
     * @return
     */
    @Bean
    public SqlInterceptor sqlInterceptor() {
        return new SqlInterceptor();
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
