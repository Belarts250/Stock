package com.codewithdankie.stock;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockApplication {

	public static void main(String[] args) {

		 ApplicationContext context = SpringApplication.run(StockApplication.class, args);
		var orderService = context.getBean(OrderService.class);

		orderService.placeOrder();

		var notificationManager = context.getBean(NotificationManager.class);
		notificationManager.sendMessage("EMAil loading ...");
	}


}
