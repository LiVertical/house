package com.wangli.house.common.service;

import com.wangli.house.common.model.User;
import com.wangli.house.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

   @Autowired
    private UserMapper userMapper;

   public List<User> getAllUsersInso(){
       return userMapper.queryAllUser();
   }
}
