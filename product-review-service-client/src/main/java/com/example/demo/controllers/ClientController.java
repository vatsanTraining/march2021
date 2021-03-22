package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {

	
	@Autowired
	private WebClient client;
	
	private String reviews;
	
	
	@GetMapping(path = "/client/reviews")
	public String getReviews() {
		
		Flux<String> response =
				client.get().uri("lb://REVIEW-SERVICE/api/v1/reviews")
				.retrieve()
				.bodyToFlux(String.class);
		
		 response.subscribe(result -> this.reviews=result);
		 
		 return reviews;
		
	}
	
	
	@GetMapping(path = "/client/v2/reviews")
	public Mono<String> getReviewsAsMono() {
		
		    	return client.get().uri("lb://REVIEW-SERVICE/api/v1/reviews")
				.retrieve()
				.bodyToMono(String.class);
		
		
	}
	
}
