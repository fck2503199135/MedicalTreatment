package com.realm;

import com.beans.fck.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class UserRealm extends AuthorizingRealm {

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //拿到用户
        User user = (User) principalCollection.getPrimaryPrincipal();

//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        return null;
    }


    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        System.out.println("========");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println(token);

        return null;
    }
}
