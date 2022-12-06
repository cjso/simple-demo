package com.simple.simpledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.simple.simpledemo.mapper")
@ComponentScan(basePackages = {"com.simple"})
@SpringBootApplication
public class SimpleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDemoApplication.class, args);
	}

}
