package com.wangli.house.common.controller;

import com.wangli.house.common.model.User;
import com.wangli.house.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUsers")
    public List<User> getAllUsersInfo(){
        return userService.getAllUsersInso();
    }
}
