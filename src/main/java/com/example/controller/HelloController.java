package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${helloController.msg}")
	private String helloControllerMsg;
	
	@RequestMapping("/hellotext")
	public String hello(){
		return helloControllerMsg;
	}

}