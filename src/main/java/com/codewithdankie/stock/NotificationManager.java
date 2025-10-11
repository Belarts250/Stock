package com.codewithdankie.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private NotificationService notificationService;

@Autowired
    public NotificationManager(@Qualifier("Email")NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    public void sendMessage(String message) {
        notificationService.send(message);
    }
}
