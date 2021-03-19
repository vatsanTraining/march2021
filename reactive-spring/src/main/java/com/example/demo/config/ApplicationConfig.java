package com.example.demo.config;

import java.time.LocalDate;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Customer;

@Configuration
public class ApplicationConfig {

	@Bean
	public Customer ramesh() {
		
		return new Customer(303,"Ramesh","ram@abc.com");
	}
	
	@Bean
	public Customer rajesh() {
		
		return new Customer(304,"Rajesh","raj@abc.com");
	}
	
	
	@Bean
	public Customer rakesh() {
		
		return new Customer(303,"Rakesh","rak@abc.com");
	}
}
