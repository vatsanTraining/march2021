package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.respos.ItemRepository;
import java.util.*;
import com.example.demo.entity.*;
@Service
public class ItemService {

	
	@Autowired
	private ItemRepository repo;


	public List<Item> getAll(){
		
		return this.repo.findAll();
	}
	
	
	public Item addItem(Item entity) {
		
		return this.repo.save(entity);
	}
	
	
}
