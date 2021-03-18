package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;

@Configuration
public class ApplicationConfig {

	
	
	
	@Bean
	public Customer ram() {
		
		return new Customer(101,"Ramesh","ram@abc.com");
	}
	
	
	@Bean
	public Customer shyam() {
		
		return new Customer(102,"Shyam","shyam@abc.com");
	}
	
	
	@Bean
	public Customer manish() {
		
		return new Customer(103,"manish","mani@abc.com");
	}
	
	
	@Bean
	public Customer patil() {
		
		return new Customer(104,"patil","patil@abc.com");
	}
	
	@Bean
	public Customer gaurav() {
		
		return new Customer(105,"Gaurav","gaurav@abc.com");
	}
	
	
}
