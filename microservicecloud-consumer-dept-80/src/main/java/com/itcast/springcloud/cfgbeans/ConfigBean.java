package com.itcast.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author congzi
 * @Description:使用配置类 代替 application.xml
 *      applicationContext.xml == ConfigBean(@Configuration)
 * @create 2018-06-15
 * @Version 1.0
 */
@Configuration
public class ConfigBean  {

    /**
     * 注入 restTemplate
     */
    @Bean
    @LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }





}
