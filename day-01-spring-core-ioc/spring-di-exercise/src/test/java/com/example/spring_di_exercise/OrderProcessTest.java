//
//package com.example.spring_di_exercise;
//
//import com.example.spring_di_exercise.notification.NotificationService;
//import com.example.spring_di_exercise.notification.OrderProcessor;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class OrderProcessorTest {
//
//    @Test
//    void sendExpectedMessage() {
//
//        class FakeNotification implements NotificationService {
//            private String receivedMessage;
//
//            @Override
//            public void send(String message) {
//                this.receivedMessage = message;
//            }
//        }
//
//        FakeNotification fakeNotification = new FakeNotification();
//        OrderProcessor processor = new OrderProcessor(fakeNotification);
//
//        processor.processOrder();
//
//        assertEquals("Order Processed", fakeNotification.receivedMessage);
//    }
//}
