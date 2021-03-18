package org.example.demo.model;

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

// Java Class with @Component will be registered as a Bean

@Component
public class Order {

	
	private int orderId;
	
}
