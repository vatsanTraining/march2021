package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReviewDTO {

	private String id;
	private String title;
	private String description;
	private double score;
	private String productId;
}
