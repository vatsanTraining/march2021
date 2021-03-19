package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CustomerService {

	
	@Autowired
	private List<Customer> custList;
	
	
	@Autowired
	private WebClient client;
	
	public Flux<Customer> getAll(){
		
		return Flux.fromIterable(custList);
	}
	
	
    public Mono<Customer> getOne(){
		
		return Mono.just(custList.get(0));
	}
	
    public void  invokeRestAPI() {
    	
    	Flux<String> list =client.get()
    	.uri("http://localhost:8080/api/v1/items")
    	.retrieve()
    	.bodyToFlux(String.class);
    	
    	list.subscribe(System.out::println);
    	
    	
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
