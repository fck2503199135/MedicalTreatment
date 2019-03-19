package com.mapper;

import com.beans.User;


public interface UserMapper {

     User getUser(String username);

     void addUser(User user);

}
