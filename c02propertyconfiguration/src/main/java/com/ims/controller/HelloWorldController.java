package com.ims.controller;

import com.ims.properties.MysqlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @Value("${helloWorld}")
    private String helloWorld;

    @Autowired
    private MysqlProperties mysqlProperties;

    @RequestMapping("/HelloWorld")
    public String showJdbc() {
        return "mysql.jdbcName:" + mysqlProperties.getJdbcName() + "<br/>"
                + "mysql.dbUrl:" + mysqlProperties.getDbUrl() + "<br/>"
                + "mysql.userName:" + mysqlProperties.getUserName() + "<br/>"
                + "mysql.password:" + mysqlProperties.getPassword() + "<br/>";
    }
}
