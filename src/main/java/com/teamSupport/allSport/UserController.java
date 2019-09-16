package com.teamSupport.allSport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers() {
        List<User> user = userMapper.findAllUsers();
        return user;
    }

    @RequestMapping(path = "/getUser", method = RequestMethod.GET)
    public @ResponseBody User getUser(@RequestParam(value = "user_key") String user_key) {
        User user = userMapper.getUser(user_key);

        return user;
    }

    @RequestMapping(path = "/insertUser", method = RequestMethod.POST)
    public @ResponseBody User insertUser(@RequestParam(value = "user_key") String user_key,
                                         @RequestParam(value = "nickname") String nickname) {
        User user = new User(user_key, nickname);
        userMapper.insertUser(user_key, nickname);
        return user;
    }


}
