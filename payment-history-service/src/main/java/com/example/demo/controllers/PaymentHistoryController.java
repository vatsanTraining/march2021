package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class PaymentHistoryController {

	
	
	@GetMapping(path = "/payments")
	public List<String> getPaymentHistory(){
		
		return Arrays.asList("jan,20200","feb,56000");
	}
}
