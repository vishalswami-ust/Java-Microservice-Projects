package com.iiht.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloclientApplication.class, args);
	}
	
	@Bean
	public RestTemplate newTemp() {
		return new RestTemplate();
	}

}
