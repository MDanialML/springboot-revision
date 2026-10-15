package com.example.spring_di_exercise.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor( @Qualifier("smsNotificationService") NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void processOrder(){
        notificationService.send("Order Processed");
    }

}
