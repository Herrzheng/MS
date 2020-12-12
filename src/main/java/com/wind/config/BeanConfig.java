package com.wind.config;

import com.wind.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wind.entity")
public class BeanConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
