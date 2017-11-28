package com.edu.service.impl;

import com.edu.dao.UsersMapper;
import com.edu.model.Users;

import javax.annotation.Resource;

/**
 * 学生实现类
 *
 * @author lee leeshuhua@163.com
 * @create 2017-11-27 22:15
 **/

public class UserServiceImpl {

    @Resource
    private UsersMapper usersMapper;

    int addUser(Users users){

        return usersMapper.insert(users);
    }
}
