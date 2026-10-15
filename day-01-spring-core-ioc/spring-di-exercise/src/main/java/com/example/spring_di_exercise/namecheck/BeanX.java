package com.example.spring_di_exercise.namecheck;

import org.springframework.stereotype.Component;

@Component("beanX")
public class BeanX implements NameCheckService{

    @Override
    public void identify() {
        System.out.println("Bean X selected");
    }

}
