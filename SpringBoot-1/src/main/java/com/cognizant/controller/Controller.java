package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String home() {
		return "Hariharan";
	}
	
	@GetMapping("about")
	public String aboutUs() {
		return "About";
	}
}
