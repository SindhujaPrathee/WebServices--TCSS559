package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DeleteBaggageResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteBaggageResponse {
	
	private boolean deletedBaggage;

	public DeleteBaggageResponse() {
		
	}

	public boolean isDeletedBaggage() {
		return deletedBaggage;
	}

	public void setDeletedBaggage(boolean deletedBaggage) {
		this.deletedBaggage = deletedBaggage;
	}
	
	

}
