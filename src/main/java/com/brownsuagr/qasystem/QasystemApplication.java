package com.brownsuagr.qasystem;

import com.brownsuagr.qasystem.utils.ServerConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.server.WebServer;
import org.springframework.context.ApplicationListener;


@MapperScan("com.brownsuagr.qasystem.mapper.*")
@SpringBootApplication
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages={"com.brownsuagr.qasystem.mapper."})
public class QasystemApplication {
    private static Logger log = LoggerFactory.getLogger(QasystemApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(QasystemApplication.class, args);
        log.info("------------------ 【QASystemApplication】已经被部署成功！----------------");
    }

}
