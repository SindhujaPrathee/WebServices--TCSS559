package com.webservice.baggagehandling.util;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.webservice.baggagehandling.model.AdminLoginResponse;
import com.webservice.baggagehandling.model.BaggageList;

public class BaggageHandlingClient {
	
	//calls GetCurrentStatus API by getting RFID from Admin and gives the result 

	public static String callGetCurrentStatus(String rfid) {
		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8080/BaggageHandlingSystem/BHS/getCurrentStatus/" + rfid);

		ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		String output = response.getEntity(String.class);
		return output;
	}

	// calls UpdateStatus API by getting RFID and status to be updated and gives the result for that
	public static String callUpdateStatus(String rfid, String status) {
		Client client = Client.create();

		String input = String.format("<UpdateStatusRequest>\n" + 
				"  <RFID_BagTag>%s</RFID_BagTag>\n" + 
				"  <status>%s</status>\n" + 
				"</UpdateStatusRequest>", rfid, status);
		WebResource webResource = client.resource("http://localhost:8080/BaggageHandlingSystem/BHS/updateStatus");
		ClientResponse response = webResource.type("application/xml").put(ClientResponse.class, input);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}
		
		return response.getEntity(String.class);
	}
	
	//calls UpdateCarousel API by getting RFID and carousel number and gives the result of that
	public static String callUpdateCarousel(String rfid, String carouselNumber) {
		Client client = Client.create();

		String input = String.format("<UpdateCarouselRequest>\n" + 
				"  <RFID_BagTag>%s</RFID_BagTag>\n" + 
				"  <carouselNumber>%s</carouselNumber>\n" + 
				"</UpdateCarouselRequest>", rfid, carouselNumber);
		WebResource webResource = client.resource("http://localhost:8080/BaggageHandlingSystem/BHS/updateCarousel");
		ClientResponse response = webResource.type("application/xml").put(ClientResponse.class, input);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}
		
		return response.getEntity(String.class);
	}
	
	//calls DeleteBaggage API by getting RFID and deletes baggage 
	public static String callDeleteBaggage(String rfid) {
		Client client = Client.create();

		String input = String.format("<DeleteBaggageRequest>\n" + 
				"  <RFID_BagTag>%s</RFID_BagTag>\n" + 
				"</DeleteBaggageRequest>", rfid);
		WebResource webResource = client.resource("http://localhost:8080/BaggageHandlingSystem/BHS/deleteBaggage");
		ClientResponse response = webResource.type("application/xml").delete(ClientResponse.class, input);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}
		
		return response.getEntity(String.class);
	}
	
	//Calls Create Baggage API by getting all required fields and gives the result of that API
	public static String callCreateBaggage(String rfid, String passengerId, String sourcePlace, String destinationPlace, String transit, String departureTime, String arrivalTime) {
		Client client = Client.create();

		String input = String.format("<CreateBaggageInfoRequest>\n" + 
				"  <RFID_BagTag>%s</RFID_BagTag>\n" + 
				"  <passengerID>%s</passengerID>\n" +
				"  <sourcePlace>%s</sourcePlace>\n" +
				"  <destinationPlace>%s</destinationPlace>\n" +
				"  <transit>%s</transit>\n" +
				"  <departureTime>%s</departureTime>\n" +
				"  <arrivalTime>%s</arrivalTime>\n" +
				"</CreateBaggageInfoRequest>", rfid, passengerId, sourcePlace, destinationPlace, transit, departureTime, arrivalTime );
		WebResource webResource = client.resource("http://localhost:8080/BaggageHandlingSystem/BHS/createBaggage");
		ClientResponse response = webResource.type("application/xml").post(ClientResponse.class, input);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}
		
		return response.getEntity(String.class);
	}
	
	//calls LoginRequest API by getting username and password
	public static boolean callLoginRequest(String userName, String passWord) {
		Client client = Client.create();

		String input = String.format("<LoginRequest>\n" + 
				"  <userName>%s</userName>\n" + 
				"  <passWord>%s</passWord>\n" + 
				"</LoginRequest>", userName, passWord);
		WebResource webResource = client.resource("http://localhost:8080/BaggageHandlingSystem/BHS/adminLogin");
		ClientResponse response = webResource.type("application/xml").post(ClientResponse.class, input);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}
		
		AdminLoginResponse loginResponse = response.getEntity(AdminLoginResponse.class);
		return loginResponse.isValidUser();
	}
	
	// calls GetBaggageList API by getting passenger ID and gives result of that
	public static BaggageList callGetBaggageList(String passengerId) {
		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8080/BaggageHandlingSystem/BHS/getBaggageList/" + passengerId);

		ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		BaggageList baggage = response.getEntity(BaggageList.class);
		return baggage;
	}
	
	//calls GetWeather API and gives the current weather for current location
	public static String getWeather() {
		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8080/BaggageHandlingSystem/BHS/weather");

		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		String output = response.getEntity(String.class);
		return output;
	}
}
