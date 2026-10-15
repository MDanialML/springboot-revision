package com.example.spring_di_exercise.namecheck;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("BeanY")
public class BeanY implements NameCheckService{

    @Override
    public void identify(){
        System.out.println("Bean Y selected");
    }
}
