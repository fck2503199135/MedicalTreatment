package com.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ShiroController {

   @RequestMapping("login")
   public String login(HttpServletRequest request) {

//       System.out.println("loginController");
       //如果登录不成功

       Object shiroLoginFailure = (String)request.getAttribute("shiroLoginFailure");
       if (shiroLoginFailure!=null){
           if(shiroLoginFailure.equals(UnknownAccountException.class.getName())){
               System.out.println("用户不存在");
           }else if(IncorrectCredentialsException.class.getName().equals(shiroLoginFailure)){
               System.out.println("密码错误！");
           }else if(LockedAccountException.class.getName().equals(shiroLoginFailure)){
               System.out.println("用户锁定！");
           }else {
               System.out.println("认证错误！");
           }
       }
//       String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
//       //根据shiro返回的异常类路径判断，抛出异常
//       if(exceptionClassName!=null){
//           if(UnknownAccountException.class.getName().equals(exceptionClassName)){
//               throw new CustomException("账号不存在");
//           }else if(IncorrectCredentialsException.class.getName().equals(
//                   exceptionClassName)){
//               throw new CustomException("用户名或密码错误");
//           }else if("randomCodeError".equals(exceptionClassName)){
//               throw new CustomException("验证码错误");
//           }else{
//               throw new Exception();
//           }
//       }
       //登录失败跳进这个页面
       return "login";


   }

}
