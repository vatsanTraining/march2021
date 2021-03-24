package com.example.demo.ifaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(url = "http://localhost:7575/api/v1", name="client")
public interface MyFeignClient {

	@GetMapping(path = "/choices")
	public ResponseEntity<String> getAll();
}
