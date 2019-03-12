package com.myservice.fck;

import com.beans.fck.User;
import com.mapper.fck.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public String loginUser(User user) {
        String userPwd = userMapper.loginUser(user);
        String logPwd = user.getPassword();
        if(userPwd.equals(logPwd)){
            return "1";
        }else {
            return "0";
        }
    }
}
