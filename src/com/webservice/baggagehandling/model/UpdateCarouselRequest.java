package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateCarouselRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateCarouselRequest {
	
	private String RFID_BagTag;
	private int carouselNumber;
	
	public UpdateCarouselRequest() {
		
	}
	
	
	public String getRFID_BagTag() {
		return RFID_BagTag;
	}


	public void setRFID_BagTag(String rFID_BagTag) {
		RFID_BagTag = rFID_BagTag;
	}


	public int getCarouselNumber() {
		return carouselNumber;
	}


	public void setCarouselNumber(int carouselNumber) {
		this.carouselNumber = carouselNumber;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateCarouselRequest [RFID_BagTag=");
		builder.append(RFID_BagTag);
		builder.append(", carouselNumber=");
		builder.append(carouselNumber);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

}
