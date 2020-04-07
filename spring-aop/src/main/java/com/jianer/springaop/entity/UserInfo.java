package com.jianer.springaop.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 杨兴健
 * @Date 2020/4/7 17:40
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 19900905L;

    private String name;
    private int age;
}
