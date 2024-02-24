package com.dlea.Course.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlea.Course.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
		
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Eudes", "eudes@gmail", "47988958832", "123456789");
		
		
		return ResponseEntity.ok().body(user);
		
	}
	

}
