package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/pg1")//anything name,retrieving page from server
	public String DemoPage1()
	{
		return "Page1";
	}
	@GetMapping("/pg2")
	public String DemoPage2()
	{
		return"Page2";
	}
	
	
}
