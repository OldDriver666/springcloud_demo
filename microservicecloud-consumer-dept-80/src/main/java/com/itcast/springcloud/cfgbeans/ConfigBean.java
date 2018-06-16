package com.itcast.springcloud.cfgbeans;

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
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }





}
