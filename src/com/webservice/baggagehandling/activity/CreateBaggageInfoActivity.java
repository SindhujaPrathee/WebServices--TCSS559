package com.webservice.baggagehandling.activity;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.BaggageHandlingDAO;
import com.webservice.baggagehandling.model.CreateBaggageInfoRequest;
import com.webservice.baggagehandling.model.CreateBaggageInfoResponse;


//Create baggage info activity using POST method
//Produces and consumes data in XML
@Path("/createBaggage")
public class CreateBaggageInfoActivity {

	@POST
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public CreateBaggageInfoResponse enact(CreateBaggageInfoRequest request) {
		System.out.println(request);
		CreateBaggageInfoResponse response = new CreateBaggageInfoResponse();
		response.setBaggageCreated(BaggageHandlingDAO.addBaggage(request));
		return response;
	}
	
}