package com.codewithdankie.stock;

import org.springframework.stereotype.Service;

@Service("Email")
public class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println(" From Email 💌");
    }
}
