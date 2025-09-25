package com.greetapp.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GrretController {
	@GetMapping("/greet")

	
public String greetUser(Model  model) {
	//cretae dara ,send to client
		
		
		
		//calling service layer
		
		//create data
		String mymessage="Have agood bad day";
		
		
		//attaching data to model
		model.addAttribute("message",mymessage);
		
		
		
//		give view page in return statement
		return "hello";
		
		
		
		
}
	
	
//	@GetMapping and request maping are same
	@GetMapping("/show-all")
	
	public String showAll(ModelMap map) {
		//call service layet
		//servive return list
		//attacth the list model
		
		map.addAttribute("products",Arrays.asList("Mobile","Laptop"));
		
		
		//return the view page
		return "hello";
		
		
	}
	
	
	@GetMapping("welcome")
	public String welcomeUser(@RequestParam("username") String username, Model model) {
	    String message = "Welcome " + username;
	    model.addAttribute("usermessage", message);
	    return "hello";
	}

	
	
	
}
