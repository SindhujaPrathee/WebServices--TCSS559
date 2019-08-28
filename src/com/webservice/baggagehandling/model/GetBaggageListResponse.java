package com.webservice.baggagehandling.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BaggageListResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetBaggageListResponse {
	
	private List<BaggageList> rfidBagTag;

	public GetBaggageListResponse() {
	}

	public List<BaggageList> getRfidBagTag() {
		return rfidBagTag;
	}

	public void setRfidBagTag(List<BaggageList> rfidBagTag) {
		this.rfidBagTag = rfidBagTag;
	}

	
}
