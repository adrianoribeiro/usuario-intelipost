package com.intelipost.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelipost.usuario.model.User;
import com.intelipost.usuario.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User getUserByName(String name) {
		return repository.getUserByName(name);
	}
}
