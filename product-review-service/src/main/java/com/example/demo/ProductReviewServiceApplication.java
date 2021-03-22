package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Review;
import com.example.demo.repos.ReviewsRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductReviewServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			ReviewsRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new Review("a101","guest","electronics",4.2D,"excellent product"));
				repo.save(new Review("a102","blogger","textile",4.,"good packaging"));
				repo.save(new Review("a103","regcustomer","mobile",4.4,"wide choice"));
				
			}
		};
	}
}
