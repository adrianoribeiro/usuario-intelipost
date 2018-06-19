package com.intelipost.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intelipost.usuario.model.User;
import com.intelipost.usuario.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(value="/{name}")
	public User getUser(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
	@GetMapping(value="/myActivities")
	public List<String> myActivities() {
		
		String name = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		return service.getUserByName(name).getPerfil().getActivities();
	}
}
