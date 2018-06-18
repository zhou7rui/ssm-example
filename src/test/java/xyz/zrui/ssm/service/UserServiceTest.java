
package xyz.zrui.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import xyz.zrui.ssm.model.User;
import xyz.zrui.ssm.model.ext.UserExtRole;

import java.util.List;

import static org.testng.Assert.*;

public class UserServiceTest extends ServiceTestBase {


    @Autowired
    private UserService userService;

    private User user;


    @BeforeClass
    private void setUp() {
        user = new User();
        user.setUserName("zhourui");
        user.setPassword("123456");
        user.setSex("1");
        user.setAge(22);
        user.setDescription("hello world");
        user.setNickName("zrui");
        user.setAvatar("https://www.google.com");
    }

    @Test
    public void testCreateUser() throws Exception {
        userService.createUser(user);
    }

    @Test
    public void findUserExtIntegral() throws Exception {
        List<UserExtRole> userExtRoles = userService.findUserExtIntegral();
        userExtRoles.forEach(System.out::println);
    }


}