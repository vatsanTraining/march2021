package com.example.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Item;

// This class replaces the xml file used in earlier versions of spring
@Configuration
public class ApplicationConfig {

	
	// Using the factory method register a bean
	
	// the method name tv will be id of the Registered bean
	
//	@Bean
//	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//	public Item tv() {
//		
//		return new Item(101,"Led Tv",2,45000.00);
//	}
	

	// BY default Spring Beans are eagerly created 
	// Can make lazy creation by adding annotation @Lazy
	
	@Bean
	@Lazy
	public Item tv() {
		
		System.out.println("Bean with Id TV Initialized");
		
		return new Item(101,"Led Tv",2,45000.00);
	}

}
