package com.service;

import com.mapper.UserMapper;
import com.beans.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserMapper um;

    @Override
    public User  getUser(String username) {
        return um.getUser(username);
    }
}
