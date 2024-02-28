package com.dlea.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dlea.Course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
