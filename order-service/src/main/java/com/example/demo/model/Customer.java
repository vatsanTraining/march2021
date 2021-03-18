package com.example.demo.model;

import java.time.LocalDate;

import org.example.demo.model.Order;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Customer {

	int id;
	String customerName;
	String email;
}
