package com.example.demo.controllers;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

	
    private static final String ORDER_SERVICE = "orderService";
    @Autowired
    private RestTemplate restTemplate;

   
    private int attempts;
    
    @GetMapping("/orders")
    @ResponseStatus(HttpStatus.OK)
    @Retry(name=ORDER_SERVICE, fallbackMethod = "orderFallback")
    public ResponseEntity<String> createOrder(){
    	log.info("Attempted :"+ attempts++);
    	  String response = restTemplate.getForObject("http://localhost:8081/item", String.class);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
    
    
    public ResponseEntity<String> orderFallback(Exception e){
    	log.info(e.getMessage());
    	attempts =1;
    
        return new ResponseEntity<String>("Item service is down", HttpStatus.OK);

    }
}


