package com.works.twodays.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncluderController {
	
	@GetMapping("/css")
	public String css() {
		
		return "inc/css";
	}
	
	@GetMapping("/js")
	public String js() {
		
		return "inc/js";
	}
	
	@GetMapping("/menu")
	public String menu(HttpServletRequest req, Model model) {
		
		String mail = ""+req.getSession().getAttribute("user");
		model.addAttribute("mail", mail);
		
		return "inc/menu";
	}
}
