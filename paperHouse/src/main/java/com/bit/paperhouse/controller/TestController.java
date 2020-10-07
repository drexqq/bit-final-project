package com.bit.paperhouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bit.paperhouse.dto.UserDto;
import com.bit.paperhouse.service.UserService;

@Controller
public class TestController {
	
	@Autowired
	UserService svc;
	
	@GetMapping(value = "/hello")
	public @ResponseBody String hello() {
		
		return"hello";
	}
	
	@GetMapping(value = "/loginAf")
	public String loginAf() {
		
		return"index";
	}
	
	@GetMapping(value = "/test")
	public @ResponseBody String test() {
		
		return"test";
	}
	
	@GetMapping(value = "/regiAf")
	public @ResponseBody void admin(UserDto dto) {
		
		svc.regi(dto);
	}
	
	@GetMapping(value = "/regi")
	public String all() {
		
		return"regi";
	}
	
	@GetMapping(value = "/loginform")
	public String loginForm() {
		
		return "loginForm";
	}
	

}