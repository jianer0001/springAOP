package com.jianer.springaop;

import com.jianer.springaop.entity.UserInfo;
import com.jianer.springaop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserInfo user = userService.findAll();
    }

    @Test
    public void test1() {
        userService.insert();
    }
}
