package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.ifaces.RecommedRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class RecommendationServiceApplication {

	
	public static void main(String[] args) {
	
		log.info("Recommend Service Started");
		SpringApplication.run(RecommendationServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		
		return new CommandLineRunner() {
			@Autowired
			RecommedRepository repo;
			@Override
			public void run(String... args) throws Exception {

				log.info("Command Line Runner Starter");
				repo.save(new Recommendation(101,"Tv","micromax","elegant design",4.2));
				repo.save(new Recommendation(102,"Mobile","Oppo","battery life",4.1));
				repo.save(new Recommendation(103,"laptop","dell","ram memory",4.3));
				
			}
		};
	}
}
