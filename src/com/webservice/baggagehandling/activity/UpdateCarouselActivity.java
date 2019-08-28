package com.webservice.baggagehandling.activity;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.BaggageHandlingDAO;
import com.webservice.baggagehandling.dao.PersonDao;
import com.webservice.baggagehandling.model.UpdateCarouselRequest;
import com.webservice.baggagehandling.model.UpdateCarouselResponse;
import com.webservice.baggagehandling.util.TwilioClient;

//update carousel number API using PUT method
@Path("/updateCarousel")
public class UpdateCarouselActivity {
	
	@PUT
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public UpdateCarouselResponse enact(UpdateCarouselRequest request) {
		System.out.println(request.toString());
		UpdateCarouselResponse response = new UpdateCarouselResponse();
		response.setUpdatedCarousel(BaggageHandlingDAO.updateCarousel(request));
		String phoneNumber = PersonDao.getPhoneNumberByBagTag(request.getRFID_BagTag());
		String notificationMsg = "You can collect you baggages from carousel number: " + request.getCarouselNumber();
		TwilioClient.sendMessage(phoneNumber, notificationMsg);
		return response;
	}

}
