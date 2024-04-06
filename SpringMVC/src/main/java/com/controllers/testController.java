package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



	@Controller
	public class testController {

		@GetMapping("/p1")
		//@RequestMapping(value="/p1", method=RequestMethod.GET)
		public String ViewPage1(Model m)
		{
			m.addAttribute("msg","This data coming from controller");
			return "page1";  // here Page1 is, Page1.jsp
		}
		
		@RequestMapping(value="/p2", method=RequestMethod.GET)
		public String ViewPage2()
		{
			return "page2";  // here Page2 is, Page2.jsp
		}
		@PostMapping("/p2submit")
		public String page2submit(Model m)
		{
			m.addAttribute("msg","submitted");
			System.out.println("page is submitted");
			return "page2";
		}
		
	}

