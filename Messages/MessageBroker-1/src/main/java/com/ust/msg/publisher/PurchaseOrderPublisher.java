package com.ust.msg.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.msg.model.OrderStatus;
import com.ust.msg.model.PurchaseOrder;


@RestController
@RequestMapping("/order")
public class PurchaseOrderPublisher {
	
	@Value("${ust.rabbitmq.queue}")
	String queuename;
	
	@Value("${ust.rabbitmq.exhange}")
	String exchange;
	
	@Value("${ust.rabbitmq.routingkey}")
	private String routingKey;
	
	@Autowired 
    private	RabbitTemplate template;
	
	@PostMapping("/{customerName}")
	
	public String bookOrder(@RequestBody PurchaseOrder order, @PathVariable String customerName) {
		
		order.setOrderId(UUID.randomUUID().toString());
		OrderStatus orderstatus = new OrderStatus(order ,"ACCEPTED","order placed successfully by " + customerName);
		template.convertAndSend(exchange , routingKey , orderstatus);
		return "Success" ;	
		
	}
	

}
