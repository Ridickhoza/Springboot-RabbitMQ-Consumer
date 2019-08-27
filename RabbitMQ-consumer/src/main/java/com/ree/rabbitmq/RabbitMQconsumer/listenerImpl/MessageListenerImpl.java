package com.ree.rabbitmq.RabbitMQconsumer.listenerImpl;

import java.util.Date;


import org.springframework.stereotype.Component;

import com.ree.rabbitmq.RabbitMQconsumer.listener.MessageListener;

@Component
public class MessageListenerImpl implements MessageListener {

	
	//private RabbitTemplate rabbitTemplate;
	
	@Override
	public void onMessage(String message) {
		System.out.println(new Date());
		//rabbitTemplate.convertSendAndReceiveAsType(RabbitMqConfig.ROUTING_KEY, message,String.class, null);
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message recieved:"+ message);
		System.out.println(new Date());
	}

	
}
