package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;

@Controller
public class HelloController {
	
	@Autowired
	MemberService svc;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home( Model model) {
		String a = "Hello world";
		model.addAttribute("test", a);
		
		return "index";
	}
	
	

}
