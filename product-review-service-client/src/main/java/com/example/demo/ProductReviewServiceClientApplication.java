package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.CreditCard;
import com.example.demo.services.CreditCardService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ProductReviewServiceClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	ctx=  SpringApplication.run(ProductReviewServiceClientApplication.class, args);
	
	
	      CreditCardService service=     ctx.getBean(CreditCardService.class);
	      
	      
	      Flux<CreditCard> cards = service.getCards();
	      
	      
	         cards.log().subscribe(System.out::println);
	         
	         
	         
	         Mono<CreditCard> card = service.getCardByPos(1);
	         
	            card.subscribe(System.out::println);
	
	}

}
