package com.example.demo.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Component
public class Payment {

	
	
	int txnId;
	double amount;
	
//	@Autowired(required = false)
//	@Qualifier(value = "ram")
//	Customer customer;
//	
	
	@Autowired(required = false)
	Customer customer;
	
	
	@Autowired
	private Environment env;
	
	
	public Payment() {
		
		System.out.println("From Constructor:=" +env);
	}
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("Active Profiles" +env.getActiveProfiles().length);
		System.out.println("Init Method"+ env.getProperty("os.name"));
	}
	
	@PreDestroy
	public void destory() {
		
		System.out.println("Destory Life cycle called");
	}
}
