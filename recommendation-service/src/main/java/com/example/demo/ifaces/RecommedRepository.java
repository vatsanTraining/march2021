package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Recommendation;

@RepositoryRestResource
public interface RecommedRepository extends JpaRepository<Recommendation,Integer > {

}
