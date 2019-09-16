package com.teamSupport.allSport;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
interface UserMapper {

//    User getUser(String user_key);
    List<User> findAllUser();
//    User insertUser(User user);
}
