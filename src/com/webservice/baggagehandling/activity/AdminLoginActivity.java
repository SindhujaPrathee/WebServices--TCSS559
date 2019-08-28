package com.webservice.baggagehandling.activity;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.BaggageHandlingDAO;
import com.webservice.baggagehandling.model.AdminLoginRequest;
import com.webservice.baggagehandling.model.AdminLoginResponse;

//Admin login api using POST method

@Path("/adminLogin")
public class AdminLoginActivity {
	
	@POST
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public AdminLoginResponse enact(AdminLoginRequest request) {
		System.out.println(request);
		AdminLoginResponse response = new AdminLoginResponse();
		response.setValidUser(BaggageHandlingDAO.loginRequest(request));
		return response;
	}

}
