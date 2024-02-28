package com.dlea.Course.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlea.Course.entities.Product;
import com.dlea.Course.services.ProductService;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService userService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {

		List<Product> list = userService.finAll();

		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findAllById(@PathVariable Long id) {

		Product obj = userService.findById(id);

		return ResponseEntity.ok().body(obj);

	}

}
