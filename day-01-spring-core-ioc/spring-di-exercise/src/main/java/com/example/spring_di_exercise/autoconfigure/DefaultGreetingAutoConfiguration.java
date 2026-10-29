
package com.example.spring_di_exercise.autoconfigure;

import com.example.spring_di_exercise.GreetingService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class DefaultGreetingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(GreetingService.class)
    public GreetingService defaultGreetingService() {
        return () -> "Hello From Default Greeting Service";
    }
}
