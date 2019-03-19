package com.realm;

import com.beans.User;
import com.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;


public class Realm extends AuthorizingRealm {



    @Resource
    UserService userService;


    //权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权操作111");
        User user = (User) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
//        判断权限

        if (user.getPid()==1){
            info.addRole("admin");
            info.addRole("doctor");
            info.addRole("patient");
        }else if(user.getPid()==2){
            info.addRole("doctor");
        }else if(user.getPid()==3){
            info.addRole("patient");
        }
//        if (user.getUsername().equals("tom")){
//            info.addStringPermissions(Arrays.asList("add","update","delete","emp:add","emp:update","emp:del"));
//            info.addRole("doctor");
//        }else {
//            info.addStringPermissions(Arrays.asList("add","emp:add","update"));
//        }

        return info;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("认证操作");
        UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
        User user = userService.getUser(token.getUsername());
        System.out.println(user);
        if (user==null){
            return null;
        }
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(user,user.getPassword(),this.getName());
        System.out.println(info);
        return info;
    }
}
