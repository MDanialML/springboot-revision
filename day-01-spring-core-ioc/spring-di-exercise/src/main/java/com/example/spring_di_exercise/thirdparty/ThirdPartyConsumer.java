package com.example.spring_di_exercise.thirdparty;

import org.springframework.stereotype.Component;

@Component
public class ThirdPartyConsumer {

    private final ThirdPartyClient thirdPartyClient;

    public ThirdPartyConsumer(ThirdPartyClient client){
        this.thirdPartyClient = client;
    }

    public void useClient(){
       thirdPartyClient.connect();
    }
}
