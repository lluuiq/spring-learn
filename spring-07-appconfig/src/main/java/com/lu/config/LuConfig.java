package com.lu.config;

import com.lu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LuConfig2.class)
public class LuConfig {

    @Bean
    // 方法名 getUser  作用就是 <bean>中的id
    public User getUser() {
        return new User();
    }
}
