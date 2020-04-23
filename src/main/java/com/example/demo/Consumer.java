package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "${spring.activemq.topic.name}")
	public void receive(Company msg) {
		System.out.println("Recieved Message: " + msg);
	}
}
