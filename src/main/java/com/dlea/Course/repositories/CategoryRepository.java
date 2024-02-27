package com.dlea.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dlea.Course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
