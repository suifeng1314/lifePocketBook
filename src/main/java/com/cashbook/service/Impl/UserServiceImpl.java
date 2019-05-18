package com.cashbook.service.Impl;

import com.cashbook.model.User;
import com.cashbook.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: longtao
 * @Date: 2019/5/17 23:17
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> selectUserList() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId((long) 1);
        user.setName("lomgtap");
        list.add(user);

        if (!CollectionUtils.isEmpty(list)){
            return list;
        }
        return null;
    }
}
