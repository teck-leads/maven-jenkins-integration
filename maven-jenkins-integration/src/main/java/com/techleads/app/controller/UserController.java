package com.techleads.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping(value = {"/"})
	public String homePage() {
		return "Welcome to User portal";
	}
	
	@GetMapping(value = {"/admin"})
	public String admin() {
		return "Welcome to Admin portal";
	}


}
