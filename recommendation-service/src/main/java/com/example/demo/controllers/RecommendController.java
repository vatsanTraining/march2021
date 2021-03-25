package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import javax.annotation.security.RolesAllowed;

import com.example.demo.*;
import com.example.demo.ifaces.RecommedRepository;

@RestController
public class RecommendController {

	private RecommedRepository repo;

	public RecommendController(RecommedRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	
	@GetMapping(path = "/api/v1/choices")
	public ResponseEntity<List<Recommendation>> getAll(){
		
		List<Recommendation> list = repo.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
}
