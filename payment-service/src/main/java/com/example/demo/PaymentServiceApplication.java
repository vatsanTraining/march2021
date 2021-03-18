package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Payment;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PaymentServiceApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	ctx=SpringApplication.run(PaymentServiceApplication.class, args);
	
	
	//case -1 
	
	     Payment pmt1 = ctx.getBean(Payment.class);
	     
	    log.info(pmt1.toString());
	     
	    
	    ctx.close();
	
	}

}
