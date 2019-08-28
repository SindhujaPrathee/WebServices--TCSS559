package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CreateBaggageInfoResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateBaggageInfoResponse {

	private boolean baggageCreated;

	public CreateBaggageInfoResponse() {

	}

	public boolean isBaggageCreated() {
		return baggageCreated;
	}

	public void setBaggageCreated(boolean baggageCreated) {
		this.baggageCreated = baggageCreated;
	}
}
