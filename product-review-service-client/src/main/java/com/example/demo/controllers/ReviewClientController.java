package com.example.demo.controllers;

import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ReviewClientController {

	  private final WebClient.Builder loadBalancedWebClientBuilder;
	  private final ReactorLoadBalancerExchangeFilterFunction lbFunction;

	  public ReviewClientController(WebClient.Builder webClientBuilder,
	      ReactorLoadBalancerExchangeFilterFunction lbFunction) {
	    this.loadBalancedWebClientBuilder = webClientBuilder;
	    this.lbFunction = lbFunction;
	  }

	  @GetMapping(path = "/hi")
	  public Mono<String> hi() {
	 

	    	return loadBalancedWebClientBuilder.build().get().uri("lb://REVIEW-SERVICE/api/v1/reviews")
			.retrieve()
			.bodyToMono(String.class);
	
		  
	  }


}
