package com.webservice.baggagehandling.util;

import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioClient {
	//calls twilio API and sends message to mobile number given in the passenger information
	static final String ACCOUNT_SID = "AC911e0e47bb190af601383a9b9da38149";
	static final String AUTH_TOKEN = "87aabd29735e0f678041fee8c5dfccb8";
	
	public static String sendMessage(String phonenumber, String messageBody) {
		try {
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			Message message = 
					Message.creator(
							new PhoneNumber(phonenumber),//to phone number
							new PhoneNumber("+12063098760"),//service registered number
							messageBody//message to be sent
						).create();
			System.out.println(message.getSid());
			return message.getSid();
		} catch (ApiException e) {
			System.out.println("Error sending message to phone number: " + phonenumber);
			e.printStackTrace();
			return null;
		}
	}
}
