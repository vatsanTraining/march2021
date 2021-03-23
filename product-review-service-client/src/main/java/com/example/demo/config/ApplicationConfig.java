package com.example.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

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
	
	@Bean
	@LoadBalanced
	public WebClient.Builder builder(){
		
		return WebClient.builder();
	}
	

	
	
	@Bean
	public WebClient client(WebClient.Builder builder) {
		return builder.build();
	}
	
	
}

