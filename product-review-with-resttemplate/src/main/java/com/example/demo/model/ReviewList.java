package com.example.demo.model;

import org.springframework.stereotype.Component;
import java.util.*;
import com.example.demo.*;
import com.example.demo.dtos.ReviewDTO;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

@Component
public class ReviewList {

	
	List<ReviewDTO> list;

	public ReviewList() {
		super();
		list = new ArrayList<>();
	}
	
	
	
}
