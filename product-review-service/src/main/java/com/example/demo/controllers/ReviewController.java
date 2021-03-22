package com.example.demo.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
import com.example.demo.services.ReviewService;

@RestController
@RequestMapping(path = "/api/v1")
public class ReviewController {

	
	@Autowired
	private ReviewService service;
	
	
	@GetMapping(path = "/reviews",produces = "application/json")
	public List<Review> getAllReviews(){
		
		return this.service.findAll();
	}
}
