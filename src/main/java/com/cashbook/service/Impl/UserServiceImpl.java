package com.cashbook.service.Impl;

import com.cashbook.dao.AppUserMapper;
import com.cashbook.dao.UserMapper;
import com.cashbook.model.AppUser;
import com.cashbook.model.AppUserExample;
import com.cashbook.model.User;
import com.cashbook.model.UserExample;
import com.cashbook.service.UserService;
import com.cashbook.util.redis.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Auther: longtao
 * @Date: 2019/5/17 23:17
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Redis redis;
    @Autowired
    private AppUserMapper appUserMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<AppUser> selectUserList() {
        AppUserExample appUserExample = new AppUserExample();

        List<AppUser> list = appUserMapper.selectByExample(appUserExample);

        if (!CollectionUtils.isEmpty(list)){
            return list;
        }
        return null;
    }

    @Override
    public Boolean insertUser(User user) {
        int count = userMapper.insertSelective(user);
        int number = 0;
        if (count > 0){
            return true;
        }
        return false;
    }
}
