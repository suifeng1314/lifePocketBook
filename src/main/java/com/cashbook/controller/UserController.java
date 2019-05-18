package com.cashbook.controller;

import com.cashbook.model.User;
import com.cashbook.service.AliPayService;
import com.cashbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: longtao
 * @Date: 2019/5/17 23:25
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private AliPayService aliPayService;

    @RequestMapping("/list")
    public Object getUsers(){
        List<User> list = userService.selectUserList();
        return list;
    }
}
