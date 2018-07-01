package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author congzi
 * @Description:
 *         标注 @EnableEurekaServer
 *         EurekaServer 服务启动类,接受其他微服务的注册
 * @create 2018-06-16
 * @Version 1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
