package com.codewithdankie.stock;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("Sms")
public class SmsService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms loading ..." +message);
    }
}
