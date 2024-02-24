package com.dlea.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dlea.Course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
