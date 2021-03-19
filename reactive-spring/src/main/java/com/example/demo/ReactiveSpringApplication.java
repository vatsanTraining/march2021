package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactiveSpringApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx	=SpringApplication.run(ReactiveSpringApplication.class, args);
	
	
	   CustomerService service = ctx.getBean(CustomerService.class);
	   
	    Flux<Customer> custList = service.getAll();
	    
	    
	      custList.map(e -> e.getCustomerName().toUpperCase()).log().subscribe( e -> System.out.println(e),
	    		                 error-> System.out.println(error), 
	    		                  ()-> System.out.println("completed")
	    		               
	    		             );
	
	       service.invokeRestAPI();
	       
	}

	
	

}
