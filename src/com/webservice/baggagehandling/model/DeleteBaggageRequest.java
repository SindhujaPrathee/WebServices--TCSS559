package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DeleteBaggageRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteBaggageRequest {
	
	private String RFID_BagTag;

	public DeleteBaggageRequest() {
		
	}

	public String getRFID_BagTag() {
		return RFID_BagTag;
	}

	public void setRFID_BagTag(String rFID_BagTag) {
		RFID_BagTag = rFID_BagTag;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DeleteBaggageRequest [RFID_BagTag=");
		builder.append(RFID_BagTag);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
