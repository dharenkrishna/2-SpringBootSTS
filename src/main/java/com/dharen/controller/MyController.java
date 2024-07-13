package com.dharen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/register")
	public String registerform() {
		return "reg";
	}
	@RequestMapping("/login")
	public String loginform() {
		return "login";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

}
