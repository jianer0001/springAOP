package com.jianer.springaop.service;

import com.jianer.springaop.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @author 杨兴健
 * @Date 2020/4/7 17:39
 */
@Service
public class UserService {

    public UserInfo findAll() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("jianer");
        userInfo.setAge(28);
        System.out.println(userInfo);
        return userInfo;
    }

    public void insert () {
        System.out.println("添加一个数据");
    }
}
