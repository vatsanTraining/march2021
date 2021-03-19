package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CustomerService {

	
	@Autowired
	private List<Customer> custList;
	
	
	public Flux<Customer> getAll(){
		
		return Flux.fromIterable(custList);
	}
	
	
    public Mono<Customer> getOne(){
		
		return Mono.just(custList.get(0));
	}
	
}
