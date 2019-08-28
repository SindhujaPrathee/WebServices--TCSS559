package com.webservice.baggagehandling.activity;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.BaggageHandlingDAO;
import com.webservice.baggagehandling.dao.PersonDao;
import com.webservice.baggagehandling.model.UpdateStatusRequest;
import com.webservice.baggagehandling.model.UpdateStatusResponse;
import com.webservice.baggagehandling.util.TwilioClient;

//update status API using PUT method
@Path("/updateStatus")
public class UpdateStatusActivity {

	@PUT
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public UpdateStatusResponse enact(UpdateStatusRequest request) {
		System.out.println(request);
		UpdateStatusResponse response = new UpdateStatusResponse();
		response.setUpdatedStatus(BaggageHandlingDAO.updateStatus(request));
		String phoneNumber = PersonDao.getPhoneNumberByBagTag(request.getRFID_BagTag());
		String notificationMsg = "Your Baggage status: " + request.getStatus();
		TwilioClient.sendMessage(phoneNumber, notificationMsg);
		return response;
	}

}
