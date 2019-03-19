package com.controller;

import com.beans.User;

import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {


    @Autowired
      UserMapper us;

    @RequestMapping(value = "/register")
    @ResponseBody
    public String addUser(User user){
        System.out.println(user);
         us.addUser(user);
        return "login";
    }

}
