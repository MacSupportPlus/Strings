package com.macsupport.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CodingController {
	// Urls.py
		@RequestMapping("/coding") 
		public String coding() {
			return "Hello coding dojo." ; 
		}
		//views.py
		@RequestMapping("/coding/python")
		public String python() {
		return "Python was awesome" ;	
		}
		@RequestMapping("/coding/java")
		public String java() {
			return "Java is better";
		}
}
