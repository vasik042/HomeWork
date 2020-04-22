package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.TimeZone;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		ParticipantService participantService = (ParticipantService) applicationContext.getBean("participantService");

		participantService.save(new Participant("1", "1", "1", "1"));
		participantService.save(new Participant("2", "2", "2", "2"));
		participantService.save(new Participant("3", "3", "3", "3"));
	}
}
