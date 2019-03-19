package com.controller.fck;

import com.beans.fck.User;
import com.google.gson.Gson;
import com.myservice.fck.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Controller
public class UserController {

//    @Autowired
//    UserService us;


//    private void addCookie(String username, String password, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
//        if (!username.equals("") && !password.equals("")) {
//            //创建  Cookie
//            Cookie usernameCookie = new Cookie("username", username);
//            Cookie passwordCookie = new Cookie("password", password);
//            //设置Cookie的父路经
//            usernameCookie.setPath(request.getContextPath() + "/");
//            passwordCookie.setPath(request.getContextPath() + "/");
//            //获取是否保存Cookie（例如：复选框的值）
//            String rememberMe = request.getParameter("rememberMe");
//
//            if (rememberMe == null || rememberMe.equals(false)) {
//                //不保存Cookie
//                usernameCookie.setMaxAge(0);
//                passwordCookie.setMaxAge(0);
//
//            } else {
//                //保存Cookie的时间长度，单位为秒
//                usernameCookie.setMaxAge(7 * 24 * 60 * 60);
//                passwordCookie.setMaxAge(7 * 24 * 60 * 60);
//            }
//
//            response.addCookie(usernameCookie);
//            response.addCookie(passwordCookie);
//        }
//    }
//
//
//    @RequestMapping("/getCookie")
//    @ResponseBody
//    public String getCookie(HttpServletRequest request) throws IOException {
//        String username = "";
//        String password = "";
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null && cookies.length > 0) {
//            //遍历Cookie
//            for (int i = 0; i < cookies.length; i++) {
//                Cookie cookie = cookies[i];
//                if ("username".equals(cookie.getName())) {
//                    username = cookie.getValue();
//                }
//                if ("password".equals(cookie.getName())) {
//                    password = cookie.getValue();
//                }
//            }
//        }
//
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//
//        Gson gson = new Gson();
//        String s = gson.toJson(user);
//
//        return s;
//
//
//    }






//    @RequestMapping("/loginUser")
//    public String loginUser(HttpServletRequest request){
//
//        String shiroLoginFailure = (String) request.getAttribute("shiroLoginFailure");
//        String log= "0";
//
//        if (shiroLoginFailure!=null){
//            if (UnknownAccountException.class.getName().equals(shiroLoginFailure)){
//                log = "1";
//            }else if (IncorrectCredentialsException.class.getName().equals(shiroLoginFailure)){
//                log = "2";
//            }else if (LockedAccountException.class.getName().equals(shiroLoginFailure)){
//                log = "3";
//            }else if (AuthenticationException.class.getName().equals(shiroLoginFailure)){
//                log = "4";
//            }
//        }else {
//            log = "5";
//        }
//
//        return log;

//        String username = user.getUsername();
//        String password = user.getPassword();
//        //添加 Cookie
//        addCookie(username, password, response, request);

//    }


}
