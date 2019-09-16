package com.teamSupport.allSport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(path = "/user")
    public String hello() {
        System.out.println("test");
        User user = new User("te123st", "Tset");
        return  user.getUser_key();
    }

    @RequestMapping(path = "/test")
    public int show() {
        System.out.println("test2");
        List<User> user = userMapper.findAllUser();

        return user.size();
    }

}
