package com.xiaomo.controller;


import com.xiaomo.domain.User;
import com.xiaomo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //这个注解表示这个类是一个控制器,可以接收前端的请求
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){

        List<User> userList = userMapper.findAll();
        System.out.println("userList == " + userList);

        return userList;
    }


}
