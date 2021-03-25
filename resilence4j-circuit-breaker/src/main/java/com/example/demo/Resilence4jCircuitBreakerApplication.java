package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Resilence4jCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Resilence4jCircuitBreakerApplication.class, args);
	}

	 @Bean
	    public RestTemplate getRestTemplate() {
	        return new RestTemplate();
	    }

}
