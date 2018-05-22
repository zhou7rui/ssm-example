# spring spring-mvc mybatis
[![Build Status](https://travis-ci.com/zhou7rui/ssm-demo.svg?branch=master)](https://travis-ci.com/zhou7rui/ssm-demo)  
使用Idea搭建的gradle项目, 集成最新版的spring 和 spring-mvc 和mybatis, 连接池使用的Tomcat-jdbc,log使用是logback,json 工具时候用的gson
```shell

└── src
    ├── main
    │   ├── java
    │   │   └── xyz
    │   │       └── zrui
    │   │           └── ssm
    │   │               ├── commons                       // commons 
    │   │               ├── controller                    // cotroller package
    │   │               ├── dao                           // dao package
    │   │               ├── model                         // modle package
    │   │               └── service                       // service package
    │   ├── resources
    │   │   ├── generatorConfig.xml                       // generator-mybatis Config file 
    │   │   ├── jdbc.properties                           // jdbc 配置文件 
    │   │   ├── logback.xml                               // logback log配置  
    │   │   ├── ssm-demo-dao.xml                          // spring dao 层mybatis配置 
    │   │   ├── ssm-demo-service.xml                      // spring service 层事务配置 
    │   │   ├── ssm-demo.sql                              // data structure  
    │   │   └── xyz
    │   │       └── zrui
    │   │           └── ssm
    │   │               ├── dao                           // generator-mybatis 生成mapper文件
    │   │               └── daoext                        // 拓展mapper文件
    │   └── webapp
    │       └── WEB-INF
    │           ├── spring
    │           │   ├── servlet-context.xml               // spirng-mvc 配置
    │           │   └── spring-context.xml                // 关联 dao service spirng 配置  
    │           ├── views                                 // jsp 目录
    │           │   └── index.jsp                   
    │           └── web.xml                               // web.xml
    └── test                                              // 单元测试目录
        ├── java
        │   └── xyz
        │       └── zrui
        │           └── ssm
        │               └── service
        └── resources
            ├── jdbc.properties                           // 测试 jdbc 配置文件 
            ├── logback-test.xml                          // 测试 logback log配置 
            ├── test-context.xml                          // 测试 spring 文件
            └── testng.xml                                // 单元测试文件
  ├── .gitignore
  ├── build.gradle                                        // gradle 配置文件
  ├── README.md                                           
  └── settings.gradle
```
## build

```shell 
├── build
│   ├── libs
│   │   └── exploded
│   │       └── ssm-demo-1.0-SNAPSHOT.war
│   │           ├── META-INF
│   │           │   └── MANIFEST.MF
│   │           └── WEB-INF
│   │               ├── classes
│   │               │   ├── generatorConfig.xml
│   │               │   ├── jdbc.properties
│   │               │   ├── logback.xml
│   │               │   ├── ssm-demo-dao.xml
│   │               │   ├── ssm-demo-service.xml
│   │               │   ├── ssm-demo.sql
│   │               │   └── xyz
│   │               ├── lib
│   │               │   ├── aspectjrt-1.8.13.jar
│   │               │   ├── aspectjweaver-1.8.13.jar
│   │               │   ├── commons-logging-1.2.jar
│   │               │   ├── gson-2.8.2.jar
│   │               │   ├── logback-classic-1.2.3.jar
│   │               │   ├── logback-core-1.2.3.jar
│   │               │   ├── mybatis-3.4.5.jar
│   │               │   ├── mybatis-generator-core-1.3.6.jar
│   │               │   ├── mybatis-spring-1.3.1.jar
│   │               │   ├── mysql-connector-java-5.1.40.jar
│   │               │   ├── slf4j-api-1.7.25.jar
│   │               │   ├── spring-aop-4.3.13.RELEASE.jar
│   │               │   ├── spring-beans-4.3.13.RELEASE.jar
│   │               │   ├── spring-context-4.3.13.RELEASE.jar
│   │               │   ├── spring-core-4.3.13.RELEASE.jar
│   │               │   ├── spring-expression-4.3.13.RELEASE.jar
│   │               │   ├── spring-jdbc-4.3.13.RELEASE.jar
│   │               │   ├── spring-tx-4.3.13.RELEASE.jar
│   │               │   ├── spring-web-4.3.13.RELEASE.jar
│   │               │   ├── spring-webmvc-4.3.13.RELEASE.jar
│   │               │   ├── tomcat-jdbc-8.5.23.jar
│   │               │   └── tomcat-juli-8.5.23.jar
│   │               ├── spring
│   │               │   ├── servlet-context.xml
│   │               │   └── spring-context.xml
│   │               ├── views
│   │               │   └── index.jsp
│   │               └── web.xml
│   └── tmp
│       └── war
│           └── MANIFEST.MF
├── build.gradle
├── out
│   ├── production
│   │   ├── classes
│   │   │   └── xyz
│   │   │       └── zrui
│   │   │           └── ssm
│   │   │               ├── commons
│   │   │               ├── controller
│   │   │               ├── dao
│   │   │               ├── model
│   │   │               └── service
│   │   └── resources
│   │       ├── generatorConfig.xml
│   │       ├── jdbc.properties
│   │       ├── logback.xml
│   │       ├── ssm-demo-dao.xml
│   │       ├── ssm-demo-service.xml
│   │       ├── ssm-demo.sql
│   │       └── xyz
│   │           └── zrui
│   │               └── ssm
│   │                   └── dao
│   └── test
│       ├── classes
│       │   └── xyz
│       │       └── zrui
│       │           └── ssm
│       │               └── service
│       └── resources
│           ├── jdbc.properties
│           ├── logback-test.xml
│           ├── test-context.xml
│           └── testng.xml

```