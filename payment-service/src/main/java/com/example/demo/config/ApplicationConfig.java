package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;

@Configuration
public class ApplicationConfig {

	
	// Case - 1 => No Bean of type Customer is available
	
	     // Solution-1 for Case -1 is register a Bean of type Customer
	
          // Solution-2 for Case -1 is @Autowired(required=false)
	
	// Case -2  => Only One Bean of type customer is available
	
	
	// Case -3 More than one Bean of type Customer is available
	
	     //solution-1 for case-3  use @Qualifier with id 
	    // Solution-2  for case-3  add @Primary to one of the Factory Method with @Bean
	@Bean
	public Customer ram() {
		
		return new Customer(101,"Ramesh","ram@abc.com");
	}
	
	
	@Bean
	public Customer shyam() {
		
		return new Customer(102,"Shyam","shyam@abc.com");
	}
	
	
	@Bean
	@Primary
	public Customer manish() {
		
		return new Customer(103,"manish","mani@abc.com");
	}
	
//	
//	@Bean
//	public Customer patil() {
//		
//		return new Customer(104,"patil","patil@abc.com");
//	}
//	
//	@Bean
//	public Customer gaurav() {
//		
//		return new Customer(105,"Gaurav","gaurav@abc.com");
//	}
	
	
}
