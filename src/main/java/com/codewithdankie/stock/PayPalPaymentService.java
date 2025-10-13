package com.codewithdankie.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("paypal")
public class PayPalPaymentService implements  PaymentService {

    @Value("${paypal.apiUrl}")
    private String apiUrl;

    @Value("${paypal.enabled}")
    private boolean enabled;

    @Value("${paypal.timeout:3000}")
    private int timeout;

    @Value("${paypal.supported-currencies}")
    private List<String> supportedCurrencies;
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("API URL: "+ apiUrl);
        System.out.println("Enabled: "+ enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Currencies: " + supportedCurrencies);
        System.out.println("Amount: " + amount);
    }
}
