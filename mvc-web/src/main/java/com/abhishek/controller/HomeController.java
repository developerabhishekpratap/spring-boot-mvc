package com.abhishek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.service.HomeService;

@RestController
@RequestMapping("v1/home")
public class HomeController {

	@Autowired
	public HomeService homeService;
	
	@RequestMapping(value="/test")
	public String test(){
		return "abhishek";
	}
	
	@RequestMapping(value="/hello")
	public String hello(){
		return homeService.helloWorld();
	}
}
