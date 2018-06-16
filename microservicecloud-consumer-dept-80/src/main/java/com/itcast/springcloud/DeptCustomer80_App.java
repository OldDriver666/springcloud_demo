package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author congzi
 * @Description: 微服务消费端启动类
 * @create 2018-06-15
 * @Version 1.0
 */
@SpringBootApplication
public class DeptCustomer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptCustomer80_App.class,args);
    }

}
