package com.simple.simpledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.simple.simpledemo.mapper")
@ComponentScan(basePackages = {"com.simple"})
@SpringBootApplication
public class SimpleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDemoApplication.class, args);
	}

}
