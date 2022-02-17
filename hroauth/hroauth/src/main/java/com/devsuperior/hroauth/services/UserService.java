package com.devsuperior.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hroauth.entities.User;
import com.devsuperior.hroauth.feingclients.UserFeingClient;

@Service
public class UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeingClient userFeingClient;
	
	public User findByEmail(String email) {
		User user = userFeingClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("email não encontrado "+email);
			throw new IllegalArgumentException("email não encontrado");
		}
		logger.info("email encontrado "+email);
		return user;
	}
}
