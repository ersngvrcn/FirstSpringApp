package com.works.twodays.controllers;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.twodays.model.UserModel;
import com.works.twodays.props.User;
import com.works.twodays.util.Material;

@Controller
public class LoginController {
	
	@Autowired UserModel userModel;
	
	@GetMapping("")
	public String login() {
		
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(User us,HttpServletRequest req, HttpServletResponse res) {
		boolean statu = userModel.loginControl(us);
		System.out.println("login statu:"+statu);
		
		if(statu) {
			//session create
			req.getSession().setAttribute("user", us.getUmail());
			
			//remember control
			if(us.getRemember()!=null) {
				Cookie cookie = new Cookie("user", Material.sifrele(us.getUmail(), 3));
				cookie.setMaxAge(60*60*24);
				res.addCookie(cookie);
			}
			
			return  "redirect:/dashboard";
		}
		return "redirect:/";
	}
	
	
	@GetMapping("/exit")
	public String exit(HttpServletRequest req, HttpServletResponse res) {
		req.getSession().removeAttribute("user");
		
		Cookie cookie = new Cookie("user", "");
		cookie.setMaxAge(0);
		res.addCookie(cookie);
		
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
}
