package com.projectZ.firstweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import com.projectZ.firstweb.model.LoginModel;
import com.projectZ.firstweb.model.SignUpModel;
import com.projectZ.firstweb.repository.InUpDbConnect;

@Configuration
@EnableAutoConfiguration
public class InUpService {
	
	@Autowired
	LoginModel loginModel;
	@Autowired
	InUpDbConnect inupDbConnection;
	
	public String login(LoginModel loginModel) {
		System.out.println(loginModel.toString());
		String name = loginModel.getUserName();
		String password = loginModel.getCity();
		System.out.println(name + " and " + password);
		return "Hello " + name + "!!. Your Password is "+ password + ". I'm from LoginService";
	}

	public String signUp(SignUpModel signupModel) {
		String name = signupModel.getUserName();
		String pswd = signupModel.getPswd();
		String conformPswd = signupModel.getConformpswd();
		String dob = signupModel.getDob().toString();
		String address = signupModel.getAddress();
		System.out.println(name + " !! " +pswd + " !! " + conformPswd + " !! " + dob + " !! " + address);
		if(pswd.equals(conformPswd)) {
			return "You r welcome !!";
		}else {
			return "Incorrect";
		}
	}

}
