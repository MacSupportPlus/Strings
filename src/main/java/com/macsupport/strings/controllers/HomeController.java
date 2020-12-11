package com.macsupport.strings.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model, HttpSession session) {
		model.addAttribute("dojoName", "Burbank");
		Integer count= (Integer)session.getAttribute("count");
		System.out.println(count);
		try {
			if (count.equals(null)) {
				session.setAttribute("count", 0);
				System.out.println(session.getAttribute("count"));
		}
	}	catch(NullPointerException e) {
			session.setAttribute("count", 0);
		}
		Integer countAfter = (Integer)session.getAttribute("count");
		System.out.println(countAfter);
		
		return "index.jsp";
	}
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(HttpSession session) {
		Integer count = (Integer)session.getAttribute("count");
		// add to count variable
		count +=1;
		// or
//		count = count + 1;
		// set count back in session
		session.setAttribute("count", count);
		
		System.out.println("count is in process: " + count);
		return "redirect:/result";
	}
	@RequestMapping("/result")
	public String result(HttpSession session, Model model) {
		Integer count = (Integer)session.getAttribute("count");
		model.addAttribute("counter", count);
		return "result.jsp";
	}
}
	
