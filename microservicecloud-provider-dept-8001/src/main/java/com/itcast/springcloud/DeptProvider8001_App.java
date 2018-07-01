package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author congzi
 * @Description: microservice-8001服务启动类
 * @create 2018-06-14
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient       //本服务启动后,会自动注入到 eureka
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }

}
