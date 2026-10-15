package com.example.spring_di_exercise.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    public PrototypeBean(){
        System.out.println("Prototype Bean is created: " + this.hashCode());
    }
}
