package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ItemService;

import java.util.*;
import com.example.demo.entity.*;
@RestController
@RequestMapping(path = "/api/v1/")
public class ItemController {

	
	
	@Autowired
	private ItemService service;
	
	
	@GetMapping(path = "/items" , produces = "application/json")
	public List<Item> findAll(){
		
		return this.service.getAll();
	}
	
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping(path = "/items" , produces = "application/json",consumes = "application/json")
	public Item addItem(@RequestBody Item item) {
		
		return this.service.addItem(item);
	}
	
	
}
