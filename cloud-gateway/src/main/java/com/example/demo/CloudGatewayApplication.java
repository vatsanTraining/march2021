package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

	
	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		
		return builder.routes()
                .route(p -> p.path("/api/v1/reviews/**")
                .filters(f -> f.addRequestHeader("Hello", "World"))
                .uri("lb://REVIEW-SERVICE"))
                .build();

		
	}
}

