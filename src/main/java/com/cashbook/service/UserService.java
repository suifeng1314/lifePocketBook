package com.cashbook.service;

import com.cashbook.model.AppUser;

import java.util.List;

/**
 * @Auther: longtao
 * @Date: 2019/5/17 23:16
 * @Description:
 */
public interface UserService {

    List<AppUser> selectUserList();

}
