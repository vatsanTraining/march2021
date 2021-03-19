package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Item;
import com.example.demo.respos.ItemRepository;

@SpringBootApplication
public class ProductRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRestServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		
		return new CommandLineRunner() {
			
			@Autowired
			ItemRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				
				
				repo.save(new Item(101,"tv",2,4500.00));
				repo.save(new Item(102,"fridge",3,14500.00));
				repo.save(new Item(103,"washing machine",3,24500.00));
				
			}
		};
	}
}
