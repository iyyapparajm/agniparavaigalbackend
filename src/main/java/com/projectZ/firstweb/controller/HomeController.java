package com.projectZ.firstweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectZ.firstweb.model.LoginModel;
import com.projectZ.firstweb.model.SignUpModel;
import com.projectZ.firstweb.repository.DBCreation;
import com.projectZ.firstweb.service.InUpService;

@RestController
public class HomeController {
	
	@Autowired	
	InUpService inupService;
	@Autowired
	DBCreation createDb;
	
	//  @CrossOrigin(origins = "http://localhost:9000")
	 @CrossOrigin(origins = "http://localhost:4200") 
	@GetMapping("/appcheck")
	public String appCheck() {
		return "Perfect!!";
	}
	
	@PostMapping("/login")
	public String login(@RequestBody LoginModel loginModel ) {
		return inupService.login(loginModel);
	}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String loginone(@RequestBody LoginModel loginModel) {
//		return loginService.login(loginModel);
//	}
	
	@PostMapping("/signup")
	public String signup(@RequestBody SignUpModel signupModel) {
		return inupService.signUp(signupModel);
	}
	
	@GetMapping("/createdb")
	public String createdb() {
		return createDb.CreateDB("InUp.db");
	}
}
