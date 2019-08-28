package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LoginRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class AdminLoginRequest {
	
	private String userName;
	private String passWord;
	
	public AdminLoginRequest() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdminLoginRequest [userName=");
		builder.append(userName);
		builder.append(", passWord=");
		builder.append(passWord);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
