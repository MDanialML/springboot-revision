package com.example.spring_di_exercise.namecheck;

import org.springframework.stereotype.Component;

@Component
public class NameCheckConsumer {

    private final NameCheckService nameCheckService;
    public NameCheckConsumer(NameCheckService beanX){
        this.nameCheckService = beanX;
    }

    public void check(){
        nameCheckService.identify();
    }
}
