package com.example.spring_di_exercise.config;

import com.example.spring_di_exercise.thirdparty.ThirdPartyClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ThirdPartyClient thirdPartyClient(){
        return new ThirdPartyClient();
    }
}
