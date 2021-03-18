package com.example.demo.model;

import java.time.LocalDate;

import org.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.util.*;
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Component
public class OrderBook {

	
	@Autowired
	List<Order> orderList;
	
}
