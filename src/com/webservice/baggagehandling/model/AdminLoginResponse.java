package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LoginResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class AdminLoginResponse {
	
	private boolean validUser;

	public AdminLoginResponse() {
		
	}

	public boolean isValidUser() {
		return validUser;
	}

	public void setValidUser(boolean validUser) {
		this.validUser = validUser;
	}
	
	
	

}
