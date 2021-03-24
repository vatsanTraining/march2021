package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ifaces.MyFeignClient;

@RestController
public class ClientController {

	

	MyFeignClient client;

	public ClientController(MyFeignClient client) {
		super();
		this.client = client;
	}
	
	
	@GetMapping(path = "/all")
	public ResponseEntity<String> findAll() {
		
		return client.getAll();
	}
}
