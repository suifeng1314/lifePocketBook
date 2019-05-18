package com.cashbook.service;

import com.cashbook.model.User;

import java.util.List;

/**
 * @Auther: longtao
 * @Date: 2019/5/17 23:16
 * @Description:
 */
public interface UserService {

    List<User> selectUserList();

}
