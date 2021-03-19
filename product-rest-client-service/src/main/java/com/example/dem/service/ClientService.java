package com.example.dem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientService {

	
	private RestTemplate template;

	private static final String baseURL = "http://localhost:8080/api/v1";
	@Autowired
	public void setTemplate(RestTemplate template) {
		this.template = template;
	}
	
	
	public void fetchItems() {
		
		String resp = template.getForObject(baseURL+"/items", String.class);
		
		System.out.println(resp);
		
	}
	
	
}
