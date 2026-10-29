package com.example.spring_di_exercise.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean {

    private static final Logger log =
            LoggerFactory.getLogger(LifeCycleBean.class);

    public LifeCycleBean() {
        log.info("1. Constructor");
    }

    @PostConstruct
    public void initialize() {
        log.info("2. PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        log.info("3. PreDestroy");
    }
}