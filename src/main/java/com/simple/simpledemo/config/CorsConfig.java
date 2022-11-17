package com.simple.simpledemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

public class CorsConfig {

    /*@Bean
    public CorsFilter corsFilter(){
        CorsConfiguration corsConfiguration=new CorsConfiguration();
        //允许跨域的主机地址,*表示所有都可以
        corsConfiguration.addAllowedOrigin("*");
        //允许跨域的请求头
        corsConfiguration.addAllowedHeader("*");
        //允许跨域的请求方法
        corsConfiguration.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsFilter(source);
    }*/
}
