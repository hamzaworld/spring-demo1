package com.springdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getGreeting() {
		return "Welcome to first spring boot application";
	}
	
	@RequestMapping("/message")
	public String getMessage() {
		return "The world is beautiful! ";
	}
	
}
