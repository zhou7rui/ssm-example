package xyz.zrui.ssm.service;

import xyz.zrui.ssm.model.User;
import xyz.zrui.ssm.model.ext.UserExtRole;

import java.util.List;

public interface UserService {

    User createUser(User user);


    List<UserExtRole> findUserExtIntegral();

}
