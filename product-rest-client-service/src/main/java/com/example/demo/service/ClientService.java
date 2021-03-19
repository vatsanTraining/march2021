package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.ItemDto;

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
	
	public void addItem(ItemDto item) {
		
		HttpEntity<ItemDto> entity = new HttpEntity<ItemDto>(item);
		
		ItemDto resp = template.postForObject(baseURL+"/items", entity, ItemDto.class);
		
		System.out.println("Added One Resource:="+resp);
	}
	
}
