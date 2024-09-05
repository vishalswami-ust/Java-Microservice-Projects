package com.msg.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.msg.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {
	@Value("${ust.rabbitmq.queue}")
	String queuename;

	@Value("${ust.rabbitmq.exchange}")
	String exchange;

	@Value("${ust.rabbitmq.routingkey}")
	private String routingKey;
	
	@RabbitListener(queues = "ust_queue")
	public void ConsumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message receievd from Queue : " + orderStatus);
	}
}
