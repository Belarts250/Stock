package com.codewithdankie.stock;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StockApplication {

	public static void main(String[] args) {

//		ApplicationContext context = SpringApplication.run(StockApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(StockApplication.class, args);
		var resource = context.getBean(HeavyResource.class);
		var orderService = context.getBean(OrderService.class);
		var orderService2  = context.getBean(OrderService.class);

		orderService.placeOrder();

		var notificationManager = context.getBean(NotificationManager.class);
		notificationManager.sendMessage("EMAil loading ...");

		context.close();
	}


}
