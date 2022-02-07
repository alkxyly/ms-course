package com.devsuperior.hruser.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.repositories.UserRepository;

@RestController
@RequestMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE )
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		Optional<User> user = this.userRepository.findById(id);
		return user.isPresent() ? ResponseEntity.ok(user.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		return ResponseEntity.ok(this.userRepository.findByEmail(email));
	}
}
