package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repos.ReviewsRepository;
import java.util.*;
import com.example.demo.entity.*;
@Service
public class ReviewService {

	
	@Autowired
	private ReviewsRepository repo;


	public List<Review> findAll(){
		
		return this.repo.findAll();
	}

}
