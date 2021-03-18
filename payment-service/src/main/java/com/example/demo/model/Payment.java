package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Component
public class Payment {

	int txnId;
	double amount;
	
//	@Autowired(required = false)
//	@Qualifier(value = "ram")
//	Customer customer;
//	
	
	@Autowired(required = false)
	Customer customer;
	
}
