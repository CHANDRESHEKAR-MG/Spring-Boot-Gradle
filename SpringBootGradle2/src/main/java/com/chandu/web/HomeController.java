
	package com.chandu.web;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	public class HomeController {

	@GetMapping("/")
	public String home() {
	    return "Hello! My First Spring Boot Application using Gradle.";
	}

	}

