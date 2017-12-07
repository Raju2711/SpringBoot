package com.app.controller;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
@RequestMapping("/greet")
public class SpringController {
	
	@RequestMapping("/world")
	public String hello() {
		 return "Hello World";
		 }
 
	 @RequestMapping("/welcome")
	 public String welcome() {
	 return "Welcome to Spring Boot Tutorials";
	 }
 
	 @RequestMapping("/hello")
	 public String myData() {
	 return "Hello Spring Boot";
	 }
}