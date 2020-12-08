package com.macsupport.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HumanController {
	
	@RequestMapping("/human/")
    public String index(@RequestParam(value="q", required=false) String searchQuery) {
        return "Hello: " + searchQuery;
    }
}
