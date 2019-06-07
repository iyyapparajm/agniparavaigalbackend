package com.projectZ.firstweb.model;

import java.sql.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class SignUpModel {
	private String userName;
	private String pswd;
	private String conformpswd;
	private Date dob;
	private String address;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getConformpswd() {
		return conformpswd;
	}
	public void setConformpswd(String conformpswd) {
		this.conformpswd = conformpswd;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "SignUpModel [userName=" + userName + ", pswd=" + pswd + ", conformpswd=" + conformpswd + ", dob=" + dob
				+ ", address=" + address + "]";
	}
	
}
