package com.dlea.Course.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlea.Course.entities.Category;
import com.dlea.Course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService userService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {

		List<Category> list = userService.finAll();

		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findAllById( @PathVariable Long id) {

		Category obj = userService.findById(id);

		return ResponseEntity.ok().body(obj);

	}

}
