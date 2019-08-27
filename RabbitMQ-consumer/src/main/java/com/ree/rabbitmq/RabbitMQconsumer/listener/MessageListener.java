package com.ree.rabbitmq.RabbitMQconsumer.listener;

public interface MessageListener {
	
	public void onMessage(String message);

}
