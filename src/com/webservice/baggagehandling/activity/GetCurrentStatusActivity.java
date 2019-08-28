package com.webservice.baggagehandling.activity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.BaggageHandlingDAO;
import com.webservice.baggagehandling.model.BaggageInfo;
import com.webservice.baggagehandling.model.GetCurrentStatusResponse;

//GetCurrentStatus API by using GET method
@Path("/getCurrentStatus")
public class GetCurrentStatusActivity {

	@GET
	@Path("/{RFID_BagTag}")
	@Produces({ MediaType.APPLICATION_XML })
	public GetCurrentStatusResponse enact(@PathParam("RFID_BagTag") String RFID_BagTag) {
		System.out.println(RFID_BagTag);
		BaggageInfo baggageLocation = BaggageHandlingDAO.getBaggageLocation(RFID_BagTag);
		return new GetCurrentStatusResponse(baggageLocation.getCurrentLocation());
	}

}
