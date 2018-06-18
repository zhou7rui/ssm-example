package xyz.zrui.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import xyz.zrui.ssm.model.Role;


public class RoleServiceTest extends ServiceTestBase{

    @Autowired
    private RoleService roleService;

    private Role role;

    @BeforeClass
    private void setUp(){
        role = new Role();
        role.setUserId(1);
        role.setTitle("admin");
    }


    @Test
    public void testCreateRole() throws Exception {
        roleService.createRole(role);
        Assert.assertNotNull(role.getId());
        Assert.assertEquals(role.getTitle(),"admin");

    }

}