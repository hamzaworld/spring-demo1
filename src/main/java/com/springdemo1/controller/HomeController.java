package com.springdemo1.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;



@RestController
@RequestMapping("/api")
public class HomeController {

	
	@GetMapping("/home")
	public String getGreeting() {
		return "Welcome to first spring boot application";
	}
	
	@RequestMapping("/message/{name}")
	public String getMessage(@PathVariable String name) {
		return "The world is beautiful! "+name;
	}
	
	@RequestMapping("/message")
	public String getMessage1(@RequestParam String name) {
		return "The world is full of flowing knowledge.." + name;
	}
	
	
	@RequestMapping("/headerInfo")
	public Object getResquestHeaderData(@RequestHeader(required=false) String name, @RequestHeader String depart){
		 List<String> list = new ArrayList<>();
		 list.add(name);
		 list.add(depart);
		 return list;
	}
	
	@RequestMapping(value="/acceptBody", consumes = "application/json", produces = "application/json", method= RequestMethod.POST)
		public Object getRequestBody(@RequestBody Object body) {
		System.out.print(body);
		
			return body;
	}
}
