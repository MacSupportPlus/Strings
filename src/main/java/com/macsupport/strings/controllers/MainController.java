package com.macsupport.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MainController {
	// Urls.py
		@RequestMapping("/") 
		public String hello() {
			return "Hello client! How are you doing?" ; 
		}
		//views.py
		@RequestMapping("/random")
		public String random() {
		return "Spring boot is great, so easy to respond with strings" ;	
		}
}
