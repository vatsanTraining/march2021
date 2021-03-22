package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreditCard {

	 private int id;
	 private String cardHolder;
	 private double creditLimit;
	 
	 
}

