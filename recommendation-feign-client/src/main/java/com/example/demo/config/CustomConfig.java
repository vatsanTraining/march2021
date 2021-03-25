package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class CustomConfig {

	
	@Bean
	public BasicAuthRequestInterceptor interceptor() {
		
		return new BasicAuthRequestInterceptor("india","india");
	}
}
