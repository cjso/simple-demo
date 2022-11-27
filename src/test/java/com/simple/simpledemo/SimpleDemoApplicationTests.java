package com.simple.simpledemo;

import com.simple.simpledemo.entity.UserInfo;
import com.simple.simpledemo.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleDemoApplicationTests {

	@Autowired
	private UserInfoService userInfoService;

	@Value("${host}")
	private String host;

	@Test
	void contextLoads() {
		System.out.println(host);
		UserInfo userInfo = userInfoService.getUserInfo(2l);
		System.out.println(userInfo.toString());
	}

}
