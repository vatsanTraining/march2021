package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import com.example.demo.dtos.*;
@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	
	@GetMapping(path = "/client/reviews")
	public List<?> getReviewList(){
		
		return this.template.getForObject("http://REVIEW-SERVICE/api/v1/reviews", List.class);
	}
	
	
	
}
