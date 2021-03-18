package com.example.demo;

import org.example.demo.model.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Item;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo,org.example.demo.model")
public class OrderServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(OrderServiceApplication.class, args);
	
		
		  Item tv = ctx.getBean("tv",Item.class);
		  
		  System.out.println(tv);
		  
		  
		  // The Bean Scope by default is singleton- checking that
		  
		  System.out.println("Is Item Singleton :="+ ctx.isSingleton("tv"));
		  
		  System.out.println("Is Item Prototype :="+ ctx.isPrototype("tv"));
		  
		  
		 
         Item fridge = ctx.getBean("fridge",Item.class);
		  
		  System.out.println(fridge);
		 
		  Order order = ctx.getBean(Order.class);
		  
		  System.out.println(order);
		  
		  ctx.close();
	
	}

	// Can register bean in this class 
	 // because it has got @SpringBootApplication which is extending @Configuration
	
	@Bean
	public Item fridge() {
		
		return new Item(102,"Washing Machine",1,25000.00);
	}
	
}
