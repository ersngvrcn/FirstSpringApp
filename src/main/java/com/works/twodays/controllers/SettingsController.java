package com.works.twodays.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.works.twodays.util.Material;

@Controller
public class SettingsController {
	
	@GetMapping("/settings")
	public String settings(HttpServletRequest req) {
		return Material.control("settings", req);

	}
	
}	
