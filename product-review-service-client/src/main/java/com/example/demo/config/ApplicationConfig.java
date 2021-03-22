package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.CreditCard;

@Configuration
public class ApplicationConfig {

	
	@Bean
	public CreditCard ram() {
		
		return new CreditCard(1919,"ramesh", 20000);
		
	}
	
	
	@Bean
	public CreditCard mani() {
		
		return new CreditCard(2969,"manish", 30000);
		
	}
	
	
	
	@Bean
	public CreditCard patil() {
		
		return new CreditCard(5919,"patil", 32000);
		
	}
	
	@Bean
	public CreditCard sawant() {
		
		return new CreditCard(6919,"sawant", 70000);
		
	}
}

