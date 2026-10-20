package com.example.spring_di_exercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomGreetingConfiguration {

    @Bean
    public GreetingService defaultGreetingService(){
        return () -> "Hello from MY CUSTOM service!";
    }
}
