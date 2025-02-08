package com.rudev.project.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rudev.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L,"Ruben Manuel", "ruben@gmail.com", "rubenManuel24", "999-999-999");
		return ResponseEntity.ok().body(u);
		
	}

}
