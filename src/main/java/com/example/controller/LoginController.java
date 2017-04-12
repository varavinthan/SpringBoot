package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.Login;
import com.example.services.LoginServices;
import com.example.services.Newuser;

@RestController
public class LoginController {
	
		
	private Login app = new LoginServices();
	private Newuser acc   = new LoginServices();
	
	@Value("${helloController.msg}")
	private String helloControllerMsg;
	
	@RequestMapping("/")
	public String hello(){
		return helloControllerMsg;
	}
	
	@RequestMapping("/login")
	public String loginApplication(@RequestParam String username, @RequestParam String password){
		app.login(username,password);
		return " Login Succesful";
	}
	
	@RequestMapping("/newuser")
	public String creatNewAccount(){
		acc.createaccount("Aravind", "Venkatasubban", "aravinthan", "12345");
		return " new account created succesfully";
	}
}
