package com.codewithdankie.stock;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;

    @Autowired
    public OrderService( PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("Hey order service created ");
    }
    @PostConstruct
    public void init(){
        System.out.println("orderService postConstructor");
    }

    @PreDestroy
    public  void cleanUp(){
        System.out.println("OrderServices preDestroy  ");
    }
//

//    public void setPaymentService( PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
    public void placeOrder(){
//         var paymentService =  new StripePaymentService();
//         var anotherService = new PayPalPaymentService();
         paymentService.processPayment(10);
//         anotherService.processPayment(20);
    }
}
