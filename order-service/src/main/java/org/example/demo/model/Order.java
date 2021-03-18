package org.example.demo.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;
import com.example.demo.model.Item;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

// Java Class with @Component will be registered as a Bean

@Component
public class Order {

	
	private int orderId;
	String status;
	LocalDate orderDate;
	Item item;

	
	public Order(int orderId, String status, LocalDate orderDate, Item item) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.orderDate = orderDate;
		this.item = item;
	}


	@Autowired
	Customer customer;
	
	
}
