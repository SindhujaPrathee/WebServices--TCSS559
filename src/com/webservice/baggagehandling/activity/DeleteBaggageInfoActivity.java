package com.webservice.baggagehandling.activity;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.BaggageHandlingDAO;
import com.webservice.baggagehandling.model.DeleteBaggageRequest;
import com.webservice.baggagehandling.model.DeleteBaggageResponse;


//DeleteBaggage API using DELETE method
@Path("/deleteBaggage")
public class DeleteBaggageInfoActivity {
	
	@DELETE
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public DeleteBaggageResponse enact(DeleteBaggageRequest request) {
		System.out.println(request.toString());
		DeleteBaggageResponse response = new DeleteBaggageResponse();
		response.setDeletedBaggage(BaggageHandlingDAO.deleteBaggage(request));
		return response;
	}

}
