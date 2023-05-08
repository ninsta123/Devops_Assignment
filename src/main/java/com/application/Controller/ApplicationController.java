package com.application.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApplicationController {
	
	
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Welcome to jenkins assignment";
	}
	
	

}
