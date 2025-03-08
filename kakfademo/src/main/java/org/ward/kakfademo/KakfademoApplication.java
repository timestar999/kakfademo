package org.ward.kakfademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.ward.kakfademo.services.MessageProducer;

@SpringBootApplication
public class KakfademoApplication {

	@Autowired
	MessageProducer messageProducer;

	public static void main(String[] args) {
		SpringApplication.run(KakfademoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("hello world, I have just started up");
		//this.messageProducer.sendMessage("Started Up");
	}

}
