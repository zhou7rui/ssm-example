/*
 * Copyright (C) Benesse China Company, 2017.All rights reserved.
 */

package xyz.zrui.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zrui.ssm.dao.RoleMapper;
import xyz.zrui.ssm.model.Role;
import xyz.zrui.ssm.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int createRole(Role role) {
        return roleMapper.insert(role);
    }
}
