package com.webservice.baggagehandling.activity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.BaggageHandlingDAO;
import com.webservice.baggagehandling.model.BaggageList;

//GetBaggageList API using GET method
@Path("/getBaggageList")
public class GetBaggageListActivity {
	
	@GET
	@Path("/{passenegerId}")
	@Produces({ MediaType.APPLICATION_XML })
	public BaggageList enact(@PathParam("passenegerId") int passenegerId) {
		System.out.println(passenegerId);
		BaggageList baggageList = BaggageHandlingDAO.getBaggageList(passenegerId);
		return baggageList;
	}

}
