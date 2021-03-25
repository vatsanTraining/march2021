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

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RecommendController {

	private RecommedRepository repo;

	public RecommendController(RecommedRepository repo) {
		super();
		
		log.info("Recomend controller initalized");
		this.repo = repo;
	}
	
	
	
	@GetMapping(path = "/api/v1/choices")
	public ResponseEntity<List<Recommendation>> getAll(){
		
		List<Recommendation> list = repo.findAll();
		
		log.info("Get All Method is fired");
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
}
