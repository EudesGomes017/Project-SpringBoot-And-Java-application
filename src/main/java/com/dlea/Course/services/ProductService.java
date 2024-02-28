package com.dlea.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlea.Course.entities.Product;
import com.dlea.Course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository categoryRepository;
	
	
	public List<Product> finAll() {
		return categoryRepository.findAll();
	}
	
	public Product findById(Long id) {
		
		 Optional<Product> obj = categoryRepository.findById(id);
		 return obj.get();
	}

}
