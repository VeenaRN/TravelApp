package com.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class LoginController {
	
	@GetMapping("login")//load page
	public String LoginPage(Model m)
	{
		return "LoginPage";
	}
	@PostMapping("logProcess")
	public String LoginPage(@RequestParam("txtUser") String uname,
			@RequestParam("txtPassword") String pass,Model m)
	{
		if(uname.equals("veena@gmail.com")&&pass.equals("V@123"))
		return "WelcomePage";
		else
			m.addAttribute("info","Please check username /password");
		return "LoginPage";
	}

}
