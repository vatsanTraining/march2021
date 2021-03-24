package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.ifaces.RecommedRepository;

@SpringBootApplication
public class RecommendationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommendationServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			RecommedRepository repo;
			@Override
			public void run(String... args) throws Exception {

				repo.save(new Recommendation(101,"Tv","micromax","elegant design",4.2));
				repo.save(new Recommendation(102,"Mobile","Oppo","battery lefe",4.1));
				repo.save(new Recommendation(103,"laptop","dell","ram memory",4.3));
				
			}
		};
	}
}
