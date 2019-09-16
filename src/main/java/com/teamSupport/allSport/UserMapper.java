package com.teamSupport.allSport;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
interface UserMapper {

    User getUser(String user_key);
    List<User> findAllUser();
    User insertUser(User user);
}
