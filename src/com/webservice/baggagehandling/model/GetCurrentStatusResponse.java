package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetBaggageLocationResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCurrentStatusResponse {
	private String status;

	
	public GetCurrentStatusResponse() {
	}

	public GetCurrentStatusResponse(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
