/*
 * Copyright (C) zhourui Company, 2017.All Rights Reserved.
 */

package xyz.zrui.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import xyz.zrui.ssm.commons.AbstractService;
import xyz.zrui.ssm.dao.UserMapper;
import xyz.zrui.ssm.model.User;
import xyz.zrui.ssm.model.UserExample;
import xyz.zrui.ssm.model.ext.UserExtRole;
import xyz.zrui.ssm.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl  extends AbstractService implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User createUser(User user) {
        int count = userMapper.insert(user);
        Assert.state(count <= 1 , "can not great than 1");
        return user;
    }

    @Override
    public List<UserExtRole> findUserExtIntegral() {
        UserExample example = new UserExample();
        return userMapper.selectUserExtRoleByExample(example);
    }
}
