package com.example.spring_di_exercise.notification;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService{
    @Override
    public  void send(String message){
        System.out.println("SMS service: " + message);
    }
}
