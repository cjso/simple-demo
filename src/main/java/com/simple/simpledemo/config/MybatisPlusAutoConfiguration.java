package com.simple.simpledemo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * @Author: yangming
 * @Date: 2019/11/22 17:41
 * @Description: mybatisplus配置
 **/
@Configuration
@MapperScan("com.encounter.**.mapper")
@ConfigurationProperties(prefix = "spring.datasource")
@EnableTransactionManagement
public class MybatisPlusAutoConfiguration {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    @Bean("pageInterceptor")
    public Interceptor pageInterceptor() {
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("supportMethodsArguments", "false");
        properties.setProperty("count", "countSql");
        properties.setProperty("autoRuntimeDialect", "true");
        properties.setProperty("pageSizeZero", "true");
        Interceptor interceptor = new PageInterceptor();
        interceptor.setProperties(properties);
        return interceptor;
    }

}
