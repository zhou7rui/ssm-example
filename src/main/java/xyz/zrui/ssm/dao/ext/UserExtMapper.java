/*
 * Copyright (C) Benesse China Company, 2017.All rights reserved.
 */

package xyz.zrui.ssm.dao.ext;

import xyz.zrui.ssm.model.UserExample;
import xyz.zrui.ssm.model.ext.UserExtRole;

import java.util.List;

public interface UserExtMapper {

    List<UserExtRole> selectUserExtRoleByExample(UserExample example);

}
