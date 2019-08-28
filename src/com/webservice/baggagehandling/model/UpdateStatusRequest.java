package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateStatusRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateStatusRequest {
	
	private String RFID_BagTag;
	
	private String status;

	public UpdateStatusRequest() {

	}

	public String getRFID_BagTag() {
		return RFID_BagTag;
	}

	public void setRFID_BagTag(String rFID_BagTag) {
		RFID_BagTag = rFID_BagTag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateStatusRequest [RFID_BagTag=");
		builder.append(RFID_BagTag);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
}
