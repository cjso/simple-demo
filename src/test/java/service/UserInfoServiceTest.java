package service;

import com.simple.simpledemo.CommonTest;
import com.simple.simpledemo.entity.UserInfo;
import com.simple.simpledemo.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class UserInfoServiceTest extends CommonTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void getUserInfoTest() {
        UserInfo userInfo = userInfoService.getUserInfo(2l);
        System.out.println(userInfo.toString());
    }
}
