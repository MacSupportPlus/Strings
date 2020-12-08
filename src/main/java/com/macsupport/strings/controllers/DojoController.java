package com.macsupport.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/dojo") 
	public String dojo() {
		return "The dojo is awesome";
	}
	@RequestMapping("/burbank-dojo")
	public String burbank() {
		return "Burbank Dojo is in So Cal";
	}
	@RequestMapping("/san-jose")
	public String sanjose() {
		return "SJ dojo is the headquaters";
	}
}
