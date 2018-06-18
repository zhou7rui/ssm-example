
package xyz.zrui.ssm.service;

import com.wix.mysql.EmbeddedMysql;
import com.wix.mysql.ScriptResolver;
import com.wix.mysql.config.MysqldConfig;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Properties;

import static com.wix.mysql.EmbeddedMysql.anEmbeddedMysql;
import static com.wix.mysql.config.Charset.UTF8;
import static com.wix.mysql.config.MysqldConfig.aMysqldConfig;
import static com.wix.mysql.distribution.Version.v5_7_latest;

@ContextConfiguration(locations = {"classpath:test-context.xml"})
public abstract class ServiceTestBase extends AbstractTestNGSpringContextTests {

    private EmbeddedMysql mysqld;

    @BeforeTest
    public void start() throws IOException {

        Resource resource = new ClassPathResource("jdbc.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        String user = props.getProperty("jdbc.user");
        String pass = props.getProperty("jdbc.pass");
        Integer port = Integer.valueOf(props.getProperty("jdbc.port"));

        MysqldConfig config = aMysqldConfig(v5_7_latest)
                .withCharset(UTF8)
                .withPort(port)
                .withUser(user,pass).build();
        String schemaSql = "ssm.sql";
        mysqld = anEmbeddedMysql(config).addSchema("ssm", ScriptResolver.classPathScript(schemaSql)).start();

    }


    @AfterTest
    public void  stop () {
        mysqld.stop();
    }


}
