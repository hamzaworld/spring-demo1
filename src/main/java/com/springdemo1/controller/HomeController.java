package com.springdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import io.swagger.annotations.Api;



@Controller
@Api(value="Home controller")

public class HomeController {

	
	@RequestMapping(value="/", method=GET)
	public String home() {
		return "redirect:/swagger-ui.html";
	}
	
	
}
