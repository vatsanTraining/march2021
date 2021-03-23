package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import com.example.demo.dtos.*;
import com.example.demo.model.ReviewList;
@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	
	@GetMapping(path = "/client/reviews")
	public List<?> getReviewList(){
		
//		ReviewList response = this.template.getForObject("http://REVIEW-SERVICE/api/v1/reviews", 
//				   ReviewList.class);
//		
//		return response.getList();
		
		return this.template.getForObject("http://REVIEW-SERVICE/api/v1/reviews",
		          List.class);

		
	}
	
	
//	@GetMapping(path = "/client/v2/reviews")
//	public ResponseEntity<List<ReviewDTO>> getReviewListAsEntity(){
//		
//		return this.template.getForEntity("http://REVIEW-SERVICE/api/v1/reviews",
//				          ResponseEntity<List.class);
//	}
	
	
	@GetMapping(path = "/client/pmthistory")
	public String getPayments(){
		
		
		return this.template.getForObject("http://PAYMENT-HISTORY/payments",
		          String.class);

		
	}

}
