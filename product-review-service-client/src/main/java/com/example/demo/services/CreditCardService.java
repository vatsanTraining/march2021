package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.model.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class CreditCardService {

	
	@Autowired
	private List<CreditCard> cardList;
	
	
	
	public Flux<CreditCard> getCards(){
		
		return Flux.fromIterable(this.cardList);
	}
	
	
	public Mono<CreditCard> getCardByPos(int pos){
		
		// check element exist;
		
		return Mono.just(cardList.get(pos));
	}
	
}
