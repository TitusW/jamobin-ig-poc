package com.example.messageincontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@SpringBootApplication
public class MessageincontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageincontrollerApplication.class, args);
	}

//	@Bean
//	public DefaultJmsListenerContainerFactory containerFactory() {
//		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//		factory.setSessionTransacted(true);
//		factory.setMaxMessagesPerTask(1);
//		factory.setConcurrency("1-5");
//		return factory;
//	}

	@Bean
	public MessageConverter jacksonJmsMessageConverter() {
		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
		converter.setTargetType(MessageType.TEXT);
		converter.setTypeIdPropertyName("_type");
		return converter;
	}

}
